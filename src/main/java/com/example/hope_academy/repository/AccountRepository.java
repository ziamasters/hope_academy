package com.example.hope_academy.repository;

import com.example.hope_academy.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}

