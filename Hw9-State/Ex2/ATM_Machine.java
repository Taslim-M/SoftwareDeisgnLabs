package EX2;

import java.util.Random;

public class ATM_Machine {
	private int currentAccountBalance;
	private PossibleState reading_Card;
	private PossibleState reading_Pin;
	private PossibleState choosing_Transaction;
	private PossibleState performing_Transaction;
	private PossibleState ejecting_Card;
	private PossibleState Abort;
	private PossibleState currentState;
	public int numberOfPinTries;
	public ATM_Machine() {
		resetRecordedInfo();
		reading_Card = new Reading_Card(this);
		reading_Pin = new Reading_Pin(this);
		choosing_Transaction = new Choosing_Transaction(this);
		performing_Transaction = new Performing_Transaction(this);
		ejecting_Card = new Ejecting_Card(this);
		Abort = new Abort(this);
		currentState = new Reading_Card(this);
	}


	public PossibleState getAbort() {
		return Abort;
	}


	public PossibleState getReading_Card() {
		return reading_Card;
	}

	public PossibleState getReading_Pin() {
		return reading_Pin;
	}

	public PossibleState getPerforming_Transaction() {
		return performing_Transaction;
	}

	public PossibleState getEjecting_Card() {
		return ejecting_Card;
	}

	public PossibleState getChoosing_Transaction() {
		return choosing_Transaction;
	}

	public void setCurrentState(PossibleState currentState) {
		this.currentState = currentState;
	}

	public int getCurrentAccountBalance() {
		return currentAccountBalance;
	}

	public void setCurrentAccountBalance(int currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}
	public void resetRecordedInfo() {
		this.currentAccountBalance =0;
		this.numberOfPinTries = 0;
	}
	//state actions
	public void cancelPressed() {
		currentState.cancelPressed();
	}

	public void pinEntered(int pin) {
		currentState.pinEntered(pin);
	}

	public void cardRead() {
		currentState.cardRead();
	}

	public void viewBalance() {
		currentState.viewBalance();
	}

	public void withdrawCash() {
		currentState.withdrawCash();
	}

	public void depositFunds() {
		currentState.depositFunds();
		
	}

	public void customerFinished() {
		currentState.customerFinished();
	}

	public void anotherTransaction() {
		currentState.anotherTransaction();
	}

	public void cardNotReadable() {
		currentState.cardNotReadable();
	}
}
