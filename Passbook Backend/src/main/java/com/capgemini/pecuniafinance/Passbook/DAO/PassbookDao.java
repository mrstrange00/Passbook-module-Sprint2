package com.capgemini.pecuniafinance.Passbook.DAO;

import java.util.Date;
import java.util.List;

import com.capgemini.pecuniafinance.Passbook.Entity.Transaction;

public interface PassbookDao {
	List<Transaction>findByAccountNumber1(long accountNumber);
	List<Transaction>updatePassbook1(long accountNumber);
	List<Transaction>displayPassbookByAccountNumber1(long accountNumber);
List<Transaction>displayPassbookByDate1(long accountNumber,Date startDate,Date endDate);
}

