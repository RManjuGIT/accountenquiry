package com.anz.wholesale.accountenquiry.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	Integer id;
	@Column(name = "accountNumber", nullable=false)
	String accountNumber;
	@Column(name = "accountName", nullable=false)
	String accountName;
	@Column(name = "date", nullable=false)
	String date;
	@Column(name = "currency", nullable=false)
	String currency;
	@Column(name = "amount", nullable=false)
	String amount;
	@Column(name = "transactionType", nullable=false)
	String transactionType;
	@Column(name = "transactionNarrative", nullable=true)
	String transactionNarrative;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionNarrative() {
		return transactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	
}
