package com.kgc.service.impl;

import com.kgc.dao.IAccountDao;
import com.kgc.domain.Account;
import com.kgc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询全部账户信息");
        return accountDao.findAll();
    }

    @Override
    public Account findById(int id) {
        System.out.println("业务层，查询账户BYID");
        return accountDao.findById(id);
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("业务层，添加账户");
        accountDao.update(account);
    }

    @Override
    public void deleteAccount(int id) {
        System.out.println("业务层，删除账户");
        accountDao.delete(id);
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户");
        accountDao.insert(account);
    }
}
