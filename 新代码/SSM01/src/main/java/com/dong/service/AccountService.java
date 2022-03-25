package com.dong.service;

import com.dong.pojo.Account;

import java.util.List;

public interface AccountService {
    public void  save(Account account);
    public List<Account> finAll();
}
