 
package abstractbankaccount;
 
public abstract class BankAccount {
    protected abstract double calculateInterest(double balance);
        protected double calculateZakat(double balance){
        if(balance>2000){
             return balance*.025;
        }
        else{
            System.out.println("Balance is insufficient");
            return 0.0;
        }
    }
}
  
