package com.example.restbalanceservicev2.controller;

import java.util.UUID;


   public class WalletRequest {
        private UUID uuid;
        private String operationType;
        private double amount;
       public WalletRequest() { }

       public WalletRequest(UUID uuid, String operationType, long amount) {
           this.uuid = uuid;
           this.operationType = operationType;
           this.amount = amount;
       }

        public UUID getWalletId() {
            return uuid;
        }

        public void setWalletId(UUID uuid) {
            this.uuid = this.uuid;
        }

        public String getOperationType() {
            return operationType;
        }

        public void setOperationType(String operationType) {
            this.operationType = operationType;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
// Constructors, getters and setters
}
