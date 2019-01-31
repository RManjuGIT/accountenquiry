package com.anz.wholesale.accountenquiry.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.wholesale.accountenquiry.bean.AccountDetails;
import com.anz.wholesale.accountenquiry.bean.TransactionDetails;
import com.anz.wholesale.accountenquiry.dao.AccountRepository;
import com.anz.wholesale.accountenquiry.dao.TransactionRepository;
import com.anz.wholesale.accountenquiry.dao.entity.Account;
import com.anz.wholesale.accountenquiry.dao.entity.Transaction;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepo;
	
	@Autowired
	private TransactionRepository transactionRepo;
	
	@Override
	public List<AccountDetails> retrieveAccountList() {
		List<Account> findAll = accountRepo.findAll();
		List<AccountDetails> accountDetails = new ArrayList<>();
		findAll.forEach(acc -> {
			AccountDetails details = new AccountDetails();
			details.setAccountName(acc.getAccountName());
			details.setAccountNumber(acc.getAccountNumber());
			details.setAccountType(acc.getAccountType());
			details.setBalance(Double.valueOf(acc.getCurrentbalance()));
			details.setCurrency(acc.getCurrency());
			details.setDate(acc.getLastupdate());
			accountDetails.add(details);
		});
		return accountDetails;
	}

	@Override
	public List<TransactionDetails> retrieveTransactionList(String accountNumber) {
		List<Transaction> transactions = transactionRepo.findByAccountNumber(accountNumber);
		List<TransactionDetails> transactionDetails = new ArrayList<>();
		transactions.forEach(tran -> {
			TransactionDetails details = new TransactionDetails();
			details.setAccountName(tran.getAccountName());
			details.setAccountNumber(tran.getAccountNumber());
			details.setAmount(Double.valueOf(tran.getAmount()));
			details.setCurrency(tran.getCurrency());
			details.setDate(tran.getDate());
			details.setTransactionNarrative(tran.getTransactionNarrative());
			details.setTransactionType(tran.getTransactionType());
			transactionDetails.add(details);
		});
		return transactionDetails;
	}

}
