package com.project.bankapp.service.impl;

import com.project.bankapp.dto.AccountDto;
import com.project.bankapp.mapper.AccountMaapper;
import com.project.bankapp.model.Account;
import com.project.bankapp.repository.AccountRepository;
import com.project.bankapp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMaapper.maptoAccount(accountDto);
       Account savedAccount= accountRepository.save(account);
        return AccountMaapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account=accountRepository
                .findById(id).orElseThrow(()->new RuntimeException("Account does not exist"));
        return AccountMaapper.mapToAccountDto(account);
    }

    @Override
    public void deleteAccount(Long id) {
        Account account=accountRepository
                .findById(id).orElseThrow(()->new RuntimeException("Account does not exist"));

        accountRepository.deleteById(id);

    }
}
