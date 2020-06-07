package com.queueproject.queuejavaproject.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class BankAccount {

    @Id
    @Column(name="account_number")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String accountNumber;
    @Column(name="account_client")
    private String accountClient;
    @Column(name="account_value")
    private Float accountValue;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountClient() {
        return accountClient;
    }

    public void setAccountClient(String accountClient) {
        this.accountClient = accountClient;
    }

    public Float getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(Float accountValue) {
        this.accountValue = accountValue;
    }
}
