/*
We have a bug to fix
So If a customer tries to withdraw more than in the account
the deduction still happens
BUG FIXED!!!!!!!
*/
package com.cozyswagez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Car RangeRover = new Car();
        RangeRover.setModel("Velar");

        System.out.println("Model is Range Rover " + RangeRover.getModel());*/


        Account CosmasAccount = new Account();
        CosmasAccount.setAccountNumber(12345678);
        CosmasAccount.setCustomerName("Cosmas Gikunju");
        CosmasAccount.setCustomerEmail("cosmas@email.com");
        CosmasAccount.setCustomerPhone(254_720_000_0L);

        String CustomerName = CosmasAccount.getCustomerName();
        int CustomerAccNumber = CosmasAccount.getAccountNumber();
        String CustomerEmail = CosmasAccount.getCustomerEmail();
        long CustomerPhone = CosmasAccount.getCustomerPhone();

        Scanner input = new Scanner(System.in);
        try {

            CosmasAccount.setAccountBalance(0d);
            //Deposit Cash
            // .\r automatically goes to the next line
            System.out.println("Enter amount of cash to deposit.\r");
            Double depositCash = input.nextDouble();
            System.out.println("Customer Details: \n" +"Name: "+ CustomerName + "\n" + "Email:" + CustomerEmail + " \n" + "Account Number: " +CustomerAccNumber +" \n" +"Phone: +"+ CustomerPhone);
            CosmasAccount.depositFunds(depositCash);

            //Get Some space
            System.out.println("=====================================================");

            //Withdraw Cash
            System.out.println("Enter amount of cash to withdraw");
            Double withdrawCash = input.nextDouble();
            System.out.println("Customer Details: \n" +"Name: "+ CustomerName + "\n" + "Email:" + CustomerEmail + " \n" + "Account Number: " +CustomerAccNumber +" \n" +"Phone: +"+ CustomerPhone);
            CosmasAccount.withdrawFunds(withdrawCash);
        } catch (Exception e) {
            System.out.println("An Error Occurred");
            System.out.println("Enter a valid amount of cash");
        }

    }
}
