package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AccountDTO;
import com.example.demo.entity.Account;
import com.example.demo.repo.AccountRepo;
import com.example.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountRepo accountRepo;

	@Override
	public String addAccount(AccountDTO accountDTO) {
		Account account = new Account(
				accountDTO.getAccountId(),
				accountDTO.getFirstName(),
				accountDTO.getLastName(),
				accountDTO.getAddress(),
				accountDTO.getMobile(),
				accountDTO.getEmailAddess()
				);
		
		accountRepo.save(account);
		return account.getFirstName();
	}

}
