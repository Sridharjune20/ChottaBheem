package org.bank;

public class BankInfo extends AxisBank {

	private void saving() {
		System.out.println("5% interest Bank");
	}
	private void fixed() {
	System.out.println("7% interest Bank");
	}
	@Override
	public void deposit() {
		System.out.println("10% interest Bank");
		super.deposit();
	}
	public static void main(String[] args) {
		BankInfo a=new BankInfo();
		
		a.saving();
		a.fixed();
		a.deposit();

}

	}
