package com.queueproject.queuejavaproject.controller;

import com.queueproject.queuejavaproject.model.BankAccount;
import com.queueproject.queuejavaproject.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {

    @Autowired
    BankAccountService bankAccountService;

    @RequestMapping(method = RequestMethod.POST, value = "/deposit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BankAccount> createDeposite(@RequestBody BankAccount bankAccount) {

        BankAccount bankAccountSaved = bankAccountService.createDeposite(bankAccount);
        System.out.println("deposite created successufuly - " + bankAccountSaved.toString());
        return new ResponseEntity<>(bankAccountSaved, HttpStatus.CREATED);
    }
}
