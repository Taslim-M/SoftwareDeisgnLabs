package EX1;

import java.util.Random;

public class VendingMachine {
	public Random random = new Random();
	private State currentState = new Select_Item();
	public int selectedItemPrice, enteredAmount;
	public boolean isClosed = false;

	public void setState(State s) {
		this.currentState = s;
	}

	public void printCurrentStateStatus() {
		currentState.printStatus();
	}

	public void itemSelected() {
		currentState.itemSelected(this);
	}

	public void coinInserted() {
		currentState.coinInserted(this);
	}

	public void itemDispensed() {
		currentState.itemDispensed(this);
	}

	public void balanceDispensed() {
		currentState.balanceDispensed(this);
	}

	public void machineClosed() {
		currentState.machineClosed(this);
	}

	public void machineNotClosed() {
		currentState.machineNotClosed(this);
	}

	public void resetPrices() {
		selectedItemPrice = enteredAmount = 0;
	}

}
