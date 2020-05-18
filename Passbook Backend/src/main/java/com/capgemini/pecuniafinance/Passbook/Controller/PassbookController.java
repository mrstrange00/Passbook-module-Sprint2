package com.capgemini.pecuniafinance.Passbook.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecuniafinance.Passbook.Entity.Transaction;
import com.capgemini.pecuniafinance.Passbook.Exception.ResourceNotFoundException;
import com.capgemini.pecuniafinance.Passbook.Repository.TransactionRepository;
import com.capgemini.pecuniafinance.Passbook.Service.PassbookService;




@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value = "/passbookdetails")
public class PassbookController {
	@Autowired
	private PassbookService passbookService;
	@Autowired
	private TransactionRepository transactionRepo;
	/*This method is being used to map the updatePassbook and will call the updatePassbook method in service layer*/
	@GetMapping("/updatePassbook/{accountNumber}")
	public List<Transaction>updatePassbook(@PathVariable long accountNumber) throws ResourceNotFoundException {
		return passbookService.updatePassbook(accountNumber);
	}

/*	this method will take account number from the url and pass the account number to the
 * displayPassbookByAccountNumber method in service class
 */
	@GetMapping("/displaypassbookByAccountnumber/{accountNumber}")
	public List<Transaction> displayPassbookByAccountNumber(@PathVariable long accountNumber) throws ResourceNotFoundException
	{
		return passbookService.displayPassbookByAccountNumber(accountNumber);
	}
	/*
	 * this method is taking startDate,endDate and account number from URL and calling displayPassbookByDate in service layer
	 */
	@GetMapping(path="/{accountNumber}/startDate/{startDate}/endDate/{endDate}")
	public List<Transaction>displayPassbookByDate(@PathVariable long accountNumber,@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate,@PathVariable @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) throws ResourceNotFoundException
	{
		return passbookService.displayPassbookByDate(accountNumber,startDate,endDate);
	}
}
