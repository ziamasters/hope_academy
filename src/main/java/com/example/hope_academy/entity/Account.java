package com.example.hope_academy.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.stereotype.Component;

@Entity
@Table
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account {

    @Id
    @Column
    private Long accountNumber;
    @Column
    private String accountName;

    @Column
    private double accountBalance;


    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

}
