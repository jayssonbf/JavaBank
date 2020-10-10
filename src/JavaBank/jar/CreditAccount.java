package JavaBank.jar;

public class CreditAccount extends AbstractBankAccount {

  private int creditLimit;

  //default constructor for CreditAccount
  CreditAccount( String name, int num, int amt ) {
    super(name, num, amt);
    this.creditLimit = (calculateCreditLimit(amt));
  }

  //overloaded constructor for CreditAccount
  CreditAccount( String name, int num, int amt, int credit ) {
    super(name, num, amt);
    this.creditLimit = credit;

  }

  private static int calculateCreditLimit( int amt ) {
		if (amt >= 1 && amt <= 2000) {
			return 100;
		} else if (amt <= 4000) {
			return 200;
		} else {
			return 300;
		}
    //endif
  }//end method calculateCreditLimit


  //modifier to set the account creditlimit
  public void setcreditlimit( int num ) {
    creditLimit = num;
  }

  //accessor to get the account creditlimit
  public int getcreditlimit( ) {

    return creditLimit;
  }

  //print method


  @Override
  public String toString( ) {
    return super.toString() + "\nCreditLimit     : " + creditLimit;
  }

  @Override
  public void deposit( int amt ) {
    balance = balance + amt;
  }

  @Override
  public int getBalance( ) {
    return balance;
  }

  @Override
  public String getBankName( ) {
    return InterfaceBankAccount.BANK;
  }
}
