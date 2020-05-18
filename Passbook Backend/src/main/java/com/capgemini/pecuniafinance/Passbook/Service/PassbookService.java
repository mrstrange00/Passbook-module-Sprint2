package com.capgemini.pecuniafinance.Passbook.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.pecuniafinance.Passbook.Entity.Transaction;
import com.capgemini.pecuniafinance.Passbook.Exception.ResourceNotFoundException;
@Service
public interface PassbookService {
	List<Transaction>updatePassbook(long accountNumber) throws ResourceNotFoundException;
		List<Transaction>displayPassbookByAccountNumber(long accountNumber)throws ResourceNotFoundException;
	List<Transaction>displayPassbookByDate(long accountNumber,Date startDate,Date endDate)throws ResourceNotFoundException;
}
