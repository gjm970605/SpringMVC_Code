package com.kgc.service;

import com.kgc.domain.Account;

import java.util.List;

public interface IAccountService {

    public List<Account> findAll();

    public Account findById(int id);

    public void updateAccount(Account account);

    public void deleteAccount(int id);

    public void saveAccount(Account account);
}
