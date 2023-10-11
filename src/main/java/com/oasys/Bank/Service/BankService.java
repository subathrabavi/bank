package com.oasys.Bank.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.Bank.Dao.BankDao;

@Service
public class BankService {
	@Autowired
	BankDao bankDao;
	public String getIfsc(String branch) {
		return bankDao.getIfsc(branch);
	}
	
	
}
