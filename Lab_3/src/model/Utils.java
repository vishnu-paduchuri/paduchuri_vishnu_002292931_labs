/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vishnupaduchuri
 */
public class Utils {
    public static boolean isValidRoutingNumber(String routingNumber) {
        String regex = "\\d+";
        return routingNumber.matches(regex) && routingNumber.length() == 9;
    }
    
    public static boolean isValidBalance(String balance) {
        String regex = "\\d+";
        return balance.matches(regex);
    }
   
    public static boolean isValidAccountNumber(String accountNumber) {
        String regex = "\\d+";
        return accountNumber.matches(regex) && accountNumber.length() > 9 && accountNumber.length() < 13;
    }
   
    public static boolean isValidBankName(String bankName) {
        String regex = "^[a-zA-Z ]+$";
        return bankName.matches(regex);
    }
}
