package EX2;

import java.util.Random;

public class Choosing_Transaction implements PossibleState {
	private ATM_Machine context;
	public Choosing_Transaction(ATM_Machine m) {
		this.context=m;
	}
	
	@Override
	public void cancelPressed() {
		System.out.println("Ejecting Card");
		context.setCurrentState(context.getEjecting_Card());
	}

	@Override
	public void pinEntered(int pin) {
		System.out.println("Already pin entered");
	}

	@Override
	public void cardRead() {
		System.out.println("Already read Card");
	}

	@Override
	public void viewBalance() {
		System.out.println("Balance : " + context.getCurrentAccountBalance());
		
		context.setCurrentState(context.getPerforming_Transaction());
	}

	@Override
	public void withdrawCash() {
		int random = (new Random()).nextInt(500);
		System.out.println("Trying to withdraw amt : " + random);
		if(random> context.getCurrentAccountBalance()) {
			System.out.println("Not Enough Balance :( ..");
		}else {
			System.out.println("Take your money :)");
		}
		context.setCurrentState(context.getPerforming_Transaction());
	}

	@Override
	public void depositFunds() {
		int random = (new Random()).nextInt(500);
		System.out.println("Depositing amount Card : " + random);
		context.setCurrentAccountBalance(context.getCurrentAccountBalance() + random);
		context.setCurrentState(context.getPerforming_Transaction());
		
	}

	@Override
	public void customerFinished() {
		System.out.println("Choose a transaction first");
	}

	@Override
	public void anotherTransaction() {
		System.out.println("First do this transaction plz..");
	}

	@Override
	public void cardNotReadable() {
		System.out.println("Already read Card");
	}
}
