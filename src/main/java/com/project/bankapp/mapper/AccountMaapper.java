package com.project.bankapp.mapper;

import com.project.bankapp.dto.AccountDto;
import com.project.bankapp.model.Account;

public class AccountMaapper {

    public static Account maptoAccount(AccountDto accountDto){
        Account account=new Account(
        accountDto.getId(),
        accountDto.getAccHolderName(),
        accountDto.getBalance()
        );
        return  account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
        account.getId(),
        account.getAccHolderName(),
        account.getBalance()
        );
        return accountDto;
    }

}
