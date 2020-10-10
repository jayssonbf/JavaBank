package JavaBank.jar;

import java.util.ArrayList;

public class TestCustomerAccounts {

  public static void main( String[] args ) {

    //AbstractBankAccount[] bankAccount = new AbstractBankAccount[5]; // holds 5 objects

    ArrayList<AbstractBankAccount> bankAccount = new ArrayList<>();
    bankAccount.add(new Account("Sanjay Gupta", 11556, 300));
    bankAccount.add(new Account("He Xai", 22338, 500));
    bankAccount.add(new Account("Ilya Mustafana", 44559, 1000));

    bankAccount.add(new CreditAccount("A.N Other", 88776, 500));
    bankAccount.add(new CreditAccount("Another One", 66778, 1000, 500));



    /*bankAccount[0] =  new Account("Sanjay Gupta", 11556, 300);
    bankAccount[1] = new Account("He Xai", 22338, 500);
    bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000);

    bankAccount[3] = new CreditAccount("A.N Other", 88776, 500);
    bankAccount[4] = new CreditAccount("Another One", 66778, 1000, 500); */


    showAllCustomerAccounts(bankAccount);
    showAllAccounts(bankAccount);
    showAllCreditAccounts(bankAccount);
  }

  public static void showAllCustomerAccounts( ArrayList<AbstractBankAccount> bankAccount ) {
    System.out.println("\n*****All Customer Accounts*****");
    for (AbstractBankAccount acct : bankAccount) {
      System.out.println(acct);
    }

  }

  public static void showAllAccounts(ArrayList<AbstractBankAccount> bankAccount){
    System.out.println("\n*****All Account Types*****");
    for (AbstractBankAccount acct : bankAccount){
      if (acct instanceof Account)
          System.out.println(acct);
    }
  }
    public static void showAllCreditAccounts(ArrayList<AbstractBankAccount> bankAccount){
      System.out.println("\n*****All Credit Accounts*****");
      for (AbstractBankAccount creditAcct : bankAccount) {
        if (creditAcct instanceof CreditAccount){
          System.out.println(creditAcct);
        }
      }
    }


}
