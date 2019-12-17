package EX1;

public class Dispense_Balance implements State {
	public void itemSelected(VendingMachine context) {
		System.out.println("Plz wait: Dispensing Balance");
	}

	public void coinInserted(VendingMachine context) {
		System.out.println("Plz wait: Dispensing Balance");
	}

	public void itemDispensed(VendingMachine context) {
		System.out.println("Plz wait: Dispensing Balance");
	}

	public void balanceDispensed(VendingMachine context) {
		int amountToDispense = context.enteredAmount - context.selectedItemPrice;
		if (amountToDispense > 0) {
			System.out.println("Balance of " + amountToDispense + " successfully Dispensed");
		} else {
			System.out.println("No Balance to Dispense");
		}
		context.resetPrices();
		context.setState(new Close_Machine());
	}

	public void machineClosed(VendingMachine context) {
		System.out.println("Plz wait: Dispensing Balance");
	}

	public void machineNotClosed(VendingMachine context) {
		System.out.println("Plz wait: Dispensing Balance");
	}

	public void printStatus() {
		System.out.println("Dispensing Balance");
	}
}
