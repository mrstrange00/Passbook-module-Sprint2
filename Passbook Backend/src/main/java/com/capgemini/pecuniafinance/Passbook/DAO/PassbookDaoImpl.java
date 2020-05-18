package com.capgemini.pecuniafinance.Passbook.DAO;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.pecuniafinance.Passbook.Entity.Transaction;
import com.capgemini.pecuniafinance.Passbook.Repository.TransactionRepository;
@Component
public class PassbookDaoImpl implements PassbookDao {
	@Autowired
	private TransactionRepository transactionRepository;
	
		@Override
		public List<Transaction>displayPassbookByAccountNumber1(long accountNumber){
			return transactionRepository.displayPassbookByAccountNumber1(accountNumber);
		}
	@Override
	public List<Transaction>displayPassbookByDate1(long accountNumber,Date startDate,Date endDate){
		return transactionRepository.displayPassbookByDate1(accountNumber, startDate, endDate);
	}
	/*
	this method is doing both first calling showPassbookByAccountNumber1 method which will return a list which contains details with status 0 and then
	it is calling updatePassbookByAccountNumber1 which will update the status from 0 to 1 and hence update the Passbook.
	*/
	@Override
	public List<Transaction>updatePassbook1(long accountNumber) {
		List<Transaction> transactionList=transactionRepository.showPassbookByAccountNumber1(accountNumber);
		transactionRepository.updatePassbookByAccountNumber1(accountNumber);
		return transactionList;
	}
	@Override
	public List<Transaction> findByAccountNumber1(long accountNumber) {
		return transactionRepository.findByAccountNumber1(accountNumber);
	}
	
}