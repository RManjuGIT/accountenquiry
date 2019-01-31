package com.anz.wholesale.accountenquiry.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anz.wholesale.accountenquiry.dao.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	@Query("select transaction from Transaction transaction where transaction.accountNumber = :accountNumber")
	List<Transaction> findByAccountNumber(@Param("accountNumber") String accountNumber);

}
