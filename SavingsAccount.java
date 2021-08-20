package ques1;

public class SavingsAccount implements BankAccount{

	@Override
	public void checkBankBalance() {
		
		System.out.println("BankBalance from Savings Account is xxx");
	}

	@Override
	public void validateUser() {

		System.out.println("The User has been validated for using the Savings Account ");
	}

}
