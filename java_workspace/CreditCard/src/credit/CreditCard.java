package credit;
class CreditCard  {
	
		// Instance variables:
		
		private String customer;// name of the customer (e.g., ”John Bowman”)
		private String bank;// name of the bank (e.g., ”California Savings”)
		private String account;// account identifier (e.g., ”5391 0375 9387 5309”)
		private int limit;// credit limit (measured in dollars)
		protected double balance;		// current balance (measured in dollars)		
		
		// Constructors:
		
		public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
		customer = cust;
		bank = bk;
		account = acnt;
		limit = lim;
		balance = initialBal;
		 
		}
 
		public CreditCard(String cust, String bk, String acnt, int lim) {
		this(cust, bk, acnt, lim, 0.0);
		// use a balance of zero as default
 
		}
 
		// Accessor methods:
 
		public String getCustomer( ) { return customer; }
        public String getBank( ) { return bank; } 
		public String getAccount( ) { return account; }
 		public int getLimit( ) { return limit; }
		public double getBalance( ) { return balance; }
 		// Update methods:
 		public boolean charge(double price) {// make a charge
 		if (price + balance > limit)// if charge would surpass limit
 		return false;		// refuse the charge
 
		// at this point, the charge is successful
 
		balance += price;		// update the balance
		return true;		// announce the good news
 
		}
 
		public void makePayment(double amount) {// make a payment
		 
		balance -= amount;
		 
		}
 
		// Utility method to print a card's information
		 
		public static void printSummary(CreditCard card) {
		 
		System.out.println("Customer = " + card.customer);		 
		System.out.println("Bank = " + card.bank); 
		System.out.println("Account = " + card.account);
 		System.out.println("Balance = " + card.balance); // implicit cast
 		System.out.println("Limit = " + card.limit);// implicit cast 
		}
 
 		
		
}
		

