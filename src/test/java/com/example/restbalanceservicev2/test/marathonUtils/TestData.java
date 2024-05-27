package com.example.restbalanceservicev2.test;

import com.example.restbalanceservicev2.model.WalletRequest;
import org.springframework.boot.test.autoconfigure.data.cassandra.DataCassandraTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.stereotype.Component;

import java.util.UUID;


public class TestData {
    public TestData(){    }
    public static String realWalletId = "27a60056-e9d7-4d35-8e0d-0cb8fa80a74e";
    public static String invalidWalletId = "bb0649f0-8bc6-4b5c-8a9e-5486286ada2f";

    public static String deposit = "deposit";
    public static String withdraw = "withdraw";
    public static String invalidOperationType = "wrongOperation";

    public  static WalletRequest posDepositWalletRequest = new WalletRequest(UUID.fromString(realWalletId),deposit,1000);

    public static WalletRequest posWithdrawWalletRequest = new WalletRequest(UUID.fromString(realWalletId),withdraw,1000);

    public static WalletRequest trueTooMuchMoneyWithdrawWR = new WalletRequest(UUID.fromString(realWalletId),withdraw,Double.MAX_VALUE);

    public static WalletRequest wrongOperationTypeWR = new WalletRequest(UUID.fromString(realWalletId), invalidOperationType,1000);

    public static WalletRequest invalidWalletIdWR = new WalletRequest(UUID.fromString(invalidWalletId),deposit,1000);


}
