package com.dong.dao;

import com.dong.pojo.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account account);
    public List<Account> finAll();
}
