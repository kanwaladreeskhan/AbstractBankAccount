package abstractbankaccount;
public class SavingsAccount extends BankAccount{
         @Override
         protected double calculateInterest(double balance){
         System.out.println("Interest rate for Savings account is 5%");
         return .05*balance;
         }
}
