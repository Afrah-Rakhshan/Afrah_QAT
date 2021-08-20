package ques1;

public class MainclassQ1 {

	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount();
		sa.validateUser();
		sa.checkBankBalance();
		
		System.out.println();
		
		CurrentAccount ca = new CurrentAccount();
		ca.validateUser();
		ca.checkBankBalance();
		
	}

}
