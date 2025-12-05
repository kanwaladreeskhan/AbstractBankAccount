package abstractbankaccount;
public class FixedDepositAccount extends BankAccount{
           @Override
         protected double calculateInterest(double balance){
         System.out.println("Interest rate for Fixed deposit account is 10%");
         return .1*balance;
         }
}
