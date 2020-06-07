package com.queueproject.queuejavaproject.repository;

import com.queueproject.queuejavaproject.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
