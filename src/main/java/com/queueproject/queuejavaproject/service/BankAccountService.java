package com.queueproject.queuejavaproject.service;

import com.queueproject.queuejavaproject.model.BankAccount;
import com.queueproject.queuejavaproject.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    @Autowired
    BankAccountRepository bankAccountRepository;

    public BankAccount createDeposit(BankAccount bankAccount){
     return bankAccountRepository.save(bankAccount);
    }

}
