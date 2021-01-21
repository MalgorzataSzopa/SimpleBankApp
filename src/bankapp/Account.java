

package bankapp;


public class Account 
{
    
    private String accountNumber;
    private String accountHolder;
    private String openDate;
    private double balance;
    
    public Account(String accNumber,String accHolder,String date, double accBalance)
    {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.openDate = date;
        this.balance = accBalance;
    }
    
    
    
}
