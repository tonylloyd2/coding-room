package credit;
public class Main {
	public static void main(String[ ] args) {
		CreditCard[ ] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("John Bowman", "California Savings",
		"5391 0375 9387 5309", 5000);
		wallet[1] = new CreditCard("John Bowman", "California Federal",
		"3485 0399 3395 1954", 3500);
		wallet[2] = new CreditCard("John Bowman", "California Finance",
		"5391 0375 9387 5309", 2500, 300);
		for (int val = 1; val <= 16; val++) {
			int new_val = 3 * val;
			int new_val2 = 2 * val;
		wallet[0].charge(new_val);
		wallet[1].charge(new_val2);
		wallet[2].charge(val);
		}
		
		for (CreditCard card : wallet) { //for each loop
		CreditCard.printSummary(card);
		// calling static method
		while (card.getBalance( ) > 200.0) {
		card.makePayment(200);
		System.out.println("New balance = " + card.getBalance( ));
		}
		
		}
		
	}
}