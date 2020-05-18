package com.capgemini.pecuniafinance.Passbook.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Transaction")
public class Transaction {
	@Id
	@Column(name="transactionId")
Long transactionId;
@Column(name="accountnumber")
long accountNumber;
@Column(name="amounttransacted")
int amountTransacted;
@Column(name="clientaccountnumber")
long clientAccountNumber;
@Temporal(TemporalType.DATE)
Date dateOfTransaction;
@Column(name="status")
int status;
@Column(name="transactonmode")
String transactionMode;
@Column(name="transactiontype")
String transactionType;

public Long getTransactionId() {
	return transactionId;
}
public void setTransactionId(Long transactionId) {
	this.transactionId = transactionId;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public int getAmountTransacted() {
	return amountTransacted;
}
public void setAmountTransacted(int amountTransacted) {
	this.amountTransacted = amountTransacted;
}
public long getClientaccountNumber() {
	return clientAccountNumber;
}
public void setClientAccountNumber(long clientAccountNumber) {
	this.clientAccountNumber = clientAccountNumber;
}
public Date getDateOfTransaction() {
	return dateOfTransaction;
}
public void setDateOfTransaction(Date dateOfTransaction) {
	this.dateOfTransaction = dateOfTransaction;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getTransactionMode() {
	return transactionMode;
}
public void setTransactionMode(String transactionMode) {
	this.transactionMode = transactionMode;
}

public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

}