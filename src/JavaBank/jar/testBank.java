package JavaBank.jar;

public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
		// Using constructor with values
    Account A1 = new Account("Sanjay Gupta",11556,300);
    Account A2 = new Account("He Xai", 22338, 500);
		Account A3 = new Account("Ilya Mustafana", 44559, 1000);
	
	// Print accounts
		A1.print();
		A2.print();
		A3.print();

	}
}
