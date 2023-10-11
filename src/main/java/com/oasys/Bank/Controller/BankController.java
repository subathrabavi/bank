package com.oasys.Bank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.Bank.Service.BankService;

@RestController
@RequestMapping(value="/Bank")
public class BankController {
	@Autowired
	BankService bankser;
	@GetMapping(value="/getifscByBranch/{branch}")
	public String getIfsc(@PathVariable String branch) {
		return bankser.getIfsc(branch);
	}


}
