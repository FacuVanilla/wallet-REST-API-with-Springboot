package com.oluwaseun.wallet.controller;



import org.springframework.data.annotation.Id;

public class Wallet {

    @Id
    private String AccNumber;
    private String AccName;
    private Double AccBalance;
    private String AccCurrency;
    private String PhoneNumber;

    public Wallet() {

    }

    public Wallet(String accNumber, String accName, Double accBalance, String accCurrency, String phoneNumber) {
        AccNumber = accNumber;
        AccName = accName;
        AccBalance = accBalance;
        AccCurrency = accCurrency;
        PhoneNumber = phoneNumber;
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setAccNumber(String accNumber) {
        AccNumber = accNumber;
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String accName) {
        AccName = accName;
    }

    public Double getAccBalance() {
        return AccBalance;
    }

    public void setAccBalance(Double accBalance) {
        AccBalance = accBalance;
    }

    public String getAccCurrency() {
        return AccCurrency;
    }

    public void setAccCurrency(String accCurrency) {
        AccCurrency = accCurrency;
    }
}
