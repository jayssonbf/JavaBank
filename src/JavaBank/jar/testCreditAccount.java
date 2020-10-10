package JavaBank.jar;

public class testCreditAccount {


  public static void main( String[] args ) {

    // Instantiate 3 accounts
    // Using constructor with values
    Account A1 = new Account("Sanjay Gupta", 11556, 300);
    // Using default constructor
    Account A2 = new Account("He Xai", 22338, 500);
    Account A3 = new Account("Ilya Mustafana", 44559, 1000);

    // Instantiate 2 credit accounts using constructor with
    // values which will call constructor from superl
    CreditAccount C1 = new CreditAccount("A.N Other", 88776, 500);
    // Using constructor with values which will call constructor from super
    CreditAccount C2 = new CreditAccount("Another", 66778, 1000, 500);

    // Print accounts
    A1.print();
    A2.print();
    A3.print();
    System.out.println(C1.toString());
    System.out.println(C2.toString());

  }
}

