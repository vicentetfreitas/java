package entities;

/*CONTA*/
public class Account {

	private Integer number;
	private String holder;
	protected Double balance;

	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	/** O SALDO S� PODE SER ALTERADO POR MET�DOS */
	/**
	 * public void setBalance(Double balance) { this.balance = balance; }
	 **/

	/* OPERA��O DE SAQUE */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/* OPERA��O DE DEPOSITO */
	public void deposit(double amount) {
		balance += amount;
	}



}
