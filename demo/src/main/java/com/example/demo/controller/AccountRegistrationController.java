package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDTO;
import com.example.demo.service.AccountService;

 

@RestController
@CrossOrigin
@RequestMapping("api/registration")
public class AccountRegistrationController {
	
	@Autowired
	private AccountService accountService;

	@PostMapping(path = "/save")
	public String saveAccount(@RequestBody AccountDTO accountDTO) {
		String id = accountService.addAccount(accountDTO);
		return id;
	}
}
