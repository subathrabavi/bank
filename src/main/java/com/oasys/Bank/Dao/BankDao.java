package com.oasys.Bank.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.Bank.Repository.BankRepository;

@Repository
public class BankDao {
@Autowired
BankRepository bankRepo;
	public String getIfsc(String branch) {
		return bankRepo.getIfsc(branch);
	}

}
