package JavaBank.jar;

public abstract class AbstractBankAccount {
  public final String BANK = "JavaBank";

  // class variables
  protected String accountname;
  protected int accountnum;
  protected int balance;

  //overloaded constructor for Account
  public AbstractBankAccount(String name, int num, int amt)
  {
    accountname=name;
    accountnum=num;
    balance=amt;
  }

  public abstract void deposit(int amt);
 // public abstract void withdraw(int amt);
  public abstract int getBalance();
  public abstract String getBankName();

  public String getbankname() {
    return InterfaceBankAccount.BANK;
  }

  //modifier to set the accountname
  public void setaccountname(String name)
  {
    accountname = name;
  }

  //accessor to get the accountname
  public String getaccountname () {
    return accountname;
  }

  //modifier to set the accountnumber
  public void setaccountnum(int num)
  {
    accountnum = num;
  }
  //accessor to get the accountnumber
  public int getaccountnum ( ) {

    return accountnum;
  }
  //modifier to set the balance
  public void setbalance(int num)
  {
    balance = num;
  }

  //accessor to get the account balance
  public int getbalance ( ) {

    return balance;
  }

  //make a withdrawal from the balance
  public void withdraw(int amt)
  {
    balance=balance-amt;
  }

  @Override
  public String toString( ) {
    return "\nBank Name       : " + getBankName() + "\n"
        + "Account Holder  : " + accountname + "\n"
        + "Account Number  : " + accountnum + "\n"
        + "Account Balance : " + balance;
  }
}
