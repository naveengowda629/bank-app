package com.project.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String accHolderName;
    private double balance;




}
