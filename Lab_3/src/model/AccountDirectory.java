/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vishnupaduchuri
 */
public class AccountDirectory {
    private ArrayList<Account> AccountList;
    
    public AccountDirectory() {
        this.AccountList = new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountList() {
        return AccountList;
    }

    public void setAccountList(ArrayList<Account> AccountList) {
        this.AccountList = AccountList;
    }
    
    public Account addAccount() {
        Account account = new Account();
        AccountList.add(account);
        return account;
    }
    
    public void deleteAccount(Account account) {
        AccountList.remove(account);
    }
    
    public Account searchAccount(String accountNumber) {
        for(Account accountInfo: AccountList) {
            if(accountInfo.getAccountNumber().equals(accountNumber)) {
                return accountInfo;
            }
        }
        return null;
    }
}
