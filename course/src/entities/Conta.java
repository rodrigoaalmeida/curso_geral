package entities;

public class Conta {
	
	private int accountNumber;
	private String accountHolder;
	private double saldo;
	
	public Conta(int accountNumber, String accoutHolder, double initialDepositValue) {
		this.accountNumber = accountNumber;
		this.accountHolder = accoutHolder;
		saldo = initialDepositValue;
	}
	
	public int getAccontNumber() {
		return accountNumber;
	}
	
	public String getAccontHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String newHolder) {
		accountHolder = newHolder;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double depositValue) {
		saldo = saldo + depositValue;
		System.out.println("Update account data:");
		this.toString();
	}
	
	public void withdraw(double withdrawValue) {
		saldo = saldo - (withdrawValue + 5.00);
		System.out.println("Update account data:");
		this.toString();
	}
	
	public String toString() {
		return "Account "
				+ getAccontNumber()
				+ ", Holder: "
				+ getAccontHolder()
				+ ", Balance: $ "
				+ String.format("%.2f%n", getSaldo());
	}

}
