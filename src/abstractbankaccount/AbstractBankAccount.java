 
package abstractbankaccount;
 
public class AbstractBankAccount {
 
    public static void main(String[] args) {
        BankAccount account1=new SavingsAccount();
        System.out.println("Interest= "+account1.calculateInterest(24000));
         System.out.println("Zakat= "+account1.calculateZakat(325600));
         BankAccount account2=new FixedDepositAccount();
         System.out.println("Interest= "+account2.calculateInterest(24000));
        System.out.println("Zakat= "+account2.calculateZakat(325600));
          BankAccount account3=new CurrentAccount();
             System.out.println("Interest= "+account3.calculateInterest(24000));
         System.out.println("Zakat= "+account3.calculateZakat(325600));
    }
    
}
