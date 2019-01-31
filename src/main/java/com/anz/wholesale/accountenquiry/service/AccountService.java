package com.anz.wholesale.accountenquiry.service;

import java.util.List;

import com.anz.wholesale.accountenquiry.bean.AccountDetails;
import com.anz.wholesale.accountenquiry.bean.TransactionDetails;

public interface AccountService {

	List<AccountDetails> retrieveAccountList();
	List<TransactionDetails> retrieveTransactionList(String accountNumber);
}
