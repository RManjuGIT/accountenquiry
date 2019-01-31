package com.anz.wholesale.accountenquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.accountenquiry.bean.AccountDetails;
import com.anz.wholesale.accountenquiry.bean.TransactionDetails;
import com.anz.wholesale.accountenquiry.service.AccountService;

/**
 * Contoller class
 * @author Manjunath
 *
 */

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	/**
	 * Gets all the accounts list
	 * @return list of accounts
	 */
	@GetMapping("/accounts/list")
	public List<AccountDetails> retrieveAccountList(){
		return accountService.retrieveAccountList();
	}
	
	/**
	 * Retrieves the account transaction for particular account
	 * @param accountNumber
	 * @return
	 */
	@GetMapping("/transaction/{accountNumber}")
	public List<TransactionDetails> retrieveTranaction(@PathVariable String accountNumber){
		return accountService.retrieveTransactionList(accountNumber);
	}
}
