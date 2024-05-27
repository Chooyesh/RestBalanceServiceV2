package com.example.restbalanceservicev2.service;

import com.example.restbalanceservicev2.controller.WalletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BalanceMessageListener {

    private  BalanceService walletService;

    @Autowired
    public BalanceMessageListener (BalanceService walletService) {
        this.walletService = walletService;
    }

    public void receiveMessage(WalletRequest request) {
        walletService.modifyBalance(request.getWalletId(), request.getOperationType(), request.getAmount());
    }
}
