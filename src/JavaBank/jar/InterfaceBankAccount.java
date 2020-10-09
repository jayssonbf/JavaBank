package JavaBank.jar;

abstract interface InterfaceBankAccount {

  public final String BANK = "JavaBank";

  abstract void deposit( int amt );

  abstract void withdraw( int amt );

  abstract int getBalance( );

  abstract String getBankName( );

}
