import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BpayTest{

  @Test
  public void testcanDepositintoAccount(){


   double amountToDeposit = 350_000;
   Account account = new Account();
   
   account.deposit(amountToDeposit);
 
   double balance = account.getBalance();
   double expectedBalance = 350_000;
   assertEquals(expectedBalance, balance);

}

 @Test
 public void testNegativeDepositAmountThrowsException(){

   double amountToDeposit = -100_000;
   Account account = new Account();


   assertThrows(IllegalArgumentException.class, ()->account.deposit(amountToDeposit));


}


@Test
public void testCanTransferFunds(){

   double amountToDeposit = 20_000;
   Account sender = new Account();
   Account recipient = new Account();

  sender.deposit(amountToDeposit);
  double transferamount = -2_250;
  sender.transferFunds(transferamount, recipient);
  
  double recipientBalance = recipient.getBalance();
  assertEquals(transferamount, recipientBalance);
  
 double senderBalance = sender.getBalance();
 assertEquals(amountToDeposit - transferamount, senderBalance);

}

@Test
public void testInsufficientBalance(){

   double amountToDeposit = 20_000;
   Account sender = new Account();
   Account recipient = new Account();
  assertThrows(IllegalArgumentException.class, ()->sender.transferFunds(amountToDeposit, recipient));

 }
}
