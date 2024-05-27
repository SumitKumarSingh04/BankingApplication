package com.bankingapplication.service;

import java.util.List;

import com.bankingapplication.dto.AccountDto;

public interface AccountService {

	AccountDto createAccount(AccountDto account);
	AccountDto getAccountById(Long id);
	AccountDto deposit(Long id,double amount);
	AccountDto withdraw(Long id,double amount);
	List<AccountDto> getAllAccounts();
	void deleteAccount(Long id);
}
