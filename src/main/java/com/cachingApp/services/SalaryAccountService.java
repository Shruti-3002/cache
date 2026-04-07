package com.cachingApp.services;

import com.cachingApp.entities.Employee;
import com.cachingApp.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}