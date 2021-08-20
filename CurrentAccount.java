package ques1;

public class CurrentAccount implements BankAccount{

	@Override
	public void checkBankBalance() {
		
		System.out.println("BankBalance from Current Account is xxx");
	}

	@Override
	public void validateUser() {
	
		System.out.println("The User has been validated for using the Current Account ");
	}

}
