package com.oluwaseun.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WalletController {

    @Autowired
    private WalletService walletService;

    @RequestMapping("/")
    public String welcome(){
        return "welcome to Bank of Nigeria";
    }

    @RequestMapping("/wallets")
    public List<Wallet> getWallets(){
        return walletService.getAllWallets();
    }

    @RequestMapping("/wallets/{accNumber}")
    public Wallet getWallet(@PathVariable String accNumber){
        return walletService.getWallet(accNumber);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/wallets")
    public void addWallet(@RequestBody Wallet wallet){
        walletService.addWallet(wallet);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/wallets/{accNumber}")
    public void updateWallet(@RequestBody  Wallet wallet, @PathVariable String accNumber){
        walletService.updateWallet(wallet, accNumber);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/wallets/{accNumber}")
    public void deleteWallet(@PathVariable String accNumber){
        walletService.deleteWallet(accNumber);
    }

}

