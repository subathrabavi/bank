package com.oasys.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.Bank.Entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Integer> {
	@Query(value = "Select ifscCode from bank_details where branch like ?",nativeQuery = true)
	public String getIfsc(String branch);
	

}
