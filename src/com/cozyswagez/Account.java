/*Changes to make
1.Withdrawing can only be for KSH 100 and above
2.Transaction Charges for withdrawals
3.Loan Calculator
4.Loans and Installments
5.GUI
and more.....
*/

//I can also use Constructors
package com.cozyswagez;

public class Account {
    private int accountNumber;
    private Double accountBalance;
    private String customerName;
    private String customerEmail;
    private long customerPhone;



    //Start of accountBalance methods
    public void depositFunds(Double depositCash){
        accountBalance += depositCash;
        System.out.println("Deposit of KSH:" + depositCash +" successful"+ "\n" +"New Account Balance KSH:" + getAccountBalance());

    }
    public void withdrawFunds(Double withdrawCash) {
         if ((withdrawCash == 0)){
            System.out.println("Withdrawal Only allowed for KSH:50 and above");
        }
        //Minimum Account Balance in the Account should be KSH100
        //Customer cannot withdraw more than in the account
        else if ( (accountBalance- withdrawCash) < (100)) {
            //If this condition is satisfied account number remains constant
            accountBalance = (accountBalance - (withdrawCash)) + (withdrawCash);
            System.out.println("You do not have sufficient funds to withdraw: KSH" + withdrawCash + "\n" +"Available Balance is: KSH" + getAccountBalance());
        } else if(accountBalance - withdrawCash >= (100)) {
            accountBalance -= withdrawCash;
            System.out.println("Withdrawal Successful, you have withdrawn: KSH" + withdrawCash +"\n"+ "New Account Balance: KSH" + getAccountBalance());
        }

    }
    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
    private Double getAccountBalance() {
        return this.accountBalance;
    } // End of accountBalance methods

    //start of accountNumber setters and getters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }//end of accountNumber getters

    //CustomerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }//CustomerName


    //CustomerPhone
    public void setCustomerPhone(long customerPhone) {
        this.customerPhone = customerPhone;
    }

    public long getCustomerPhone() {
        return customerPhone;
    }//CustomerPhone

    //CustomerEmail
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }//CustomerEmail

}
