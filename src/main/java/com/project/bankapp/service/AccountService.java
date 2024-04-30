package com.project.bankapp.service;

import com.project.bankapp.dto.AccountDto;
import com.project.bankapp.model.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    void deleteAccount(Long id);
}
