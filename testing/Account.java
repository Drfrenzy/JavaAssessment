public class Account{

   private double balance;
 
public void deposit(double amount){
         if(amount <= 0) throw new IllegalArgumentException("Invalid Deposit Amount");
         balance += amount;  

 }

public double getBalance(){

     return balance;

  }
  public void transferFunds(double amount, Account recipient){
       if(balance < amount)throw new IllegalArgumentException("Insufficient Balance");
       if(amount <= 0) throw new IllegalArgumentException("Invalid Transfer Amount");
       balance = balance - amount;
       recipient.deposit(amount);
       
       
}

  
}