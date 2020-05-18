package com.capgemini.pecuniafinance.Passbook.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecuniafinance.Passbook.DAO.PassbookDao;
import com.capgemini.pecuniafinance.Passbook.Entity.Transaction;
import com.capgemini.pecuniafinance.Passbook.Exception.ResourceNotFoundException;
import com.capgemini.pecuniafinance.Passbook.Repository.TransactionRepository;





@Service
public class PassbookServiceImpl implements PassbookService {
	@Autowired
	private PassbookDao passbookDao;
	
		@Override
		public List<Transaction>displayPassbookByAccountNumber(long accountNumber)throws ResourceNotFoundException{
			List<Transaction> accountCheck = passbookDao.findByAccountNumber1(accountNumber);
			List<Transaction> passbook = new ArrayList<Transaction>();
			if(accountCheck!=null) {
			passbook= passbookDao.displayPassbookByAccountNumber1(accountNumber);
		}
			else throw new ResourceNotFoundException("Account does not exist");
			return passbook;
		}
	@Override
	public List<Transaction>displayPassbookByDate(long accountNumber,Date startDate,Date endDate) throws ResourceNotFoundException{
		List<Transaction> accountCheck = passbookDao.findByAccountNumber1(accountNumber);
		List<Transaction> passbook = new ArrayList<Transaction>();
		if(accountCheck!=null) {
		passbook=passbookDao.displayPassbookByDate1(accountNumber, startDate, endDate);
	}
		else throw new ResourceNotFoundException("Account does not exist");
		return passbook;}
	@Override
	public List<Transaction>updatePassbook(long accountNumber) throws ResourceNotFoundException{
		List<Transaction> accountCheck = passbookDao.findByAccountNumber1(accountNumber);
		List<Transaction> passbook = new ArrayList<Transaction>();
		if(accountCheck!=null) {
		passbook= passbookDao.updatePassbook1(accountNumber);
	}
		else throw new ResourceNotFoundException("Account does not exist");
			
		return passbook;
	}
	
	
}