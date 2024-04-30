package com.project.bankapp.controller;

import com.project.bankapp.dto.AccountDto;
import com.project.bankapp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody  AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable  Long id){
        AccountDto accountDto= accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(Long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("deleted successfully");
    }

}
