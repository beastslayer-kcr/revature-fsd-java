
public class Account {
	private String accountNumber;
	private double balance;
	private Transaction[]  transactions;
	public Account(String accountNumber, double balance, Transaction[] transaction) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactions = transaction;
	}
	public void printStatement() {
		System.out.println("Account Statement of " + accountNumber);
		System.out.println("Initial Balance: " + balance);
		
		System.out.println("\n----------------------------");
		System.out.println("Type Transaction Balance");
		System.out.println("------------------------------");
		for(Transaction transaction : transactions) {
			if(transaction.getType() == 'D') {
				balance += transaction.getAmount();
			}
			if(transaction.getType() == 'W') {
				balance -= transaction.getAmount();
			}
			transaction.displayTransaction(balance);
		}
	}
	public static void main(String args[]) {
		Transaction transaction1 = new Transaction('W', 5000);
		Transaction transaction2 = new Transaction('D', 20000);
		Transaction transaction3 = new Transaction('D', 500);
		Transaction transaction4 = new Transaction('W', 15500);
		Transaction transaction5 = new Transaction('D', 10000);
		
		Transaction[] transactionArray = {transaction1, transaction2, transaction3, transaction4, transaction5};
		Account account = new Account("01302343794", 5000.0, transactionArray);
		account.printStatement();
	}
}
