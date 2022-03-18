package com.oluwaseun.wallet.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WalletService {


    private List<Wallet> wallets = new ArrayList<>(Arrays.asList(
            new Wallet( "01022020","Remilekun Alade",75000.00,"Naira","08010101010"),
            new Wallet( "02022020","John Ebuka",35000.10,"Naira","07020202020"),
            new Wallet( "03022020","Musa Bashir",50000.54,"Naira","  08130303030")

    ));

    public List<Wallet> getAllWallets(){
        return wallets;
    }

    public Wallet getWallet(String acctNumber){
        return wallets.stream().filter(w->w.getAccNumber().equals(acctNumber)).findFirst().get();
    }

    public void addWallet(Wallet wallet){
        wallets.add(wallet);
    }

    public void updateWallet(Wallet wallet, String acctNumber){
        for(int i = 0; i < wallets.size(); i++){
            Wallet w = wallets.get(i);
            if(w.getAccNumber().equals(acctNumber)){
                wallets.set(i, wallet);
            }
        }


    }

    public void deleteWallet(String accNumber){
        wallets.remove(accNumber);
    }

}

