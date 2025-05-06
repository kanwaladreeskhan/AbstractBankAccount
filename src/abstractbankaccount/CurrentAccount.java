 
package abstractbankaccount;
 
public class CurrentAccount extends BankAccount{
    
         @Override
         protected double calculateInterest(double balance){
         System.out.println("Interest rate for Current account is 20%");
         return .2*balance;
         }
}
