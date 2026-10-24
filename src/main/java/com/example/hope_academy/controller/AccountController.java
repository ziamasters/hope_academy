package com.example.hope_academy.controller;

import com.example.hope_academy.entity.Account;
import com.example.hope_academy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService as;

    @PostMapping("/saveAcccDetails")
    public void save(@RequestBody Account ac) {

        as.save(ac);

    }

    @GetMapping("/get")
    public List<Account> getData() {

        return as.getAllData();
    }

    @PutMapping("/acc/update/{accNum}")
    public void update(@PathVariable Long accNum, @RequestBody Account ac) {

        ac.setAccountNumber(accNum);
        as.update(ac);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Account ac)
    {

        as.delete(ac);

    }

}