package com.dong.service.impl;

import com.dong.dao.AccountMapper;
import com.dong.pojo.Account;
import com.dong.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    public void save(Account account) {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            mapper.save(account);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Account> finAll() {
        String resource = "sqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            List<Account> accounts = mapper.finAll();
            return accounts;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
