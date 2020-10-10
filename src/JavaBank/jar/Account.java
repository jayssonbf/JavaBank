package JavaBank.jar;

public class Account extends AbstractBankAccount {

  private int bonusValue;

  Account( String name, int num, int amt ) {
    super(name, num, (amt + calculateInitialBonusValue(amt)));
  }

  private static int calculateInitialBonusValue( int amt ) {
    if (amt >= 1 && amt <= 100) {
      return 10;
    } else if (amt <= 300) {
      return 20;
    } else {
      return 30;
    }
    //endif
  }//end method calculateInitialBonusValue

  //make a deposit to the balance
  public void deposit( int amt ) {
    if (amt > 100) {
      balance = balance + (amt + (int) (bonusValue * 0.1));
    } else {
      balance = balance + amt;
    }
  }


  @Override
  public int getBalance( ) {
    return balance;
  }

  @Override
  public String getBankName( ) {
    return InterfaceBankAccount.BANK;
  }

  //print method
  public void print( ) {
    System.out.println(super.toString());
  }
}

