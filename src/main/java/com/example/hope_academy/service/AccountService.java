package com.example.hope_academy.service;

import com.example.hope_academy.entity.Account;
import com.example.hope_academy.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository ar;

    public void save(Account account){

       ar.save(account);

    }

    public List<Account> getAllData(){

        return ar.findAll();
    }

    public void update(Account account) {

       ar.save(account);
    }

    public void delete(Account account){

        ar.delete(account);
    }
}
