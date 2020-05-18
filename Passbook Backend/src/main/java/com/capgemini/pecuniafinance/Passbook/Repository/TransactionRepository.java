package com.capgemini.pecuniafinance.Passbook.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.pecuniafinance.Passbook.Entity.Transaction;



@Repository
@Transactional
public interface TransactionRepository  extends CrudRepository<Transaction,Long> {	
	@Query(value="SELECT * FROM Transaction WHERE accountnumber=?1 AND status=0",nativeQuery=true)
	List<Transaction>showPassbookByAccountNumber1(long accountNumber);
	@Modifying
		@Query(value="UPDATE Transaction t SET t.status=1 WHERE accountnumber=?1 AND status=0",nativeQuery=true)
		void updatePassbookByAccountNumber1(@Param("accountNumber")long accountNumber);
	@Query(value="SELECT * FROM Transaction WHERE accountnumber=?1",nativeQuery=true)
	List<Transaction>displayPassbookByAccountNumber1(long accountNumber);
	@Query(value="SELECT * from Transaction WHERE accountnumber=?1 AND dateoftransaction BETWEEN ?2 and ?3",nativeQuery=true)
	List<Transaction>displayPassbookByDate1(long accountNumber,Date startDate,Date endDate);
	@Query(value="SELECT * FROM Transaction WHERE accountnumber=?1",nativeQuery=true)
	List<Transaction>findByAccountNumber1(long accountNumber);
}
