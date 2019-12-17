package EX1;

public class Dispense_Item implements State {
	public void itemSelected(VendingMachine context) {
		System.out.println("Please wait for Item to Dispense");
	}

	public void coinInserted(VendingMachine context) {
		System.out.println("Please wait for Item to Dispense");
	}

	public void itemDispensed(VendingMachine context) {
		System.out.println("Item successfully Dispensed.. giving back the change");
		context.setState(new Dispense_Balance());
	}

	public void balanceDispensed(VendingMachine context) {
		System.out.println("Please wait for Item to Dispense");
	}

	public void machineClosed(VendingMachine context) {
		System.out.println("Please wait for Item to Dispense");
	}

	public void machineNotClosed(VendingMachine context) {
		System.out.println("Please wait for Item to Dispense");
	}

	public void printStatus() {
		System.out.println("Dispensing Item");
	}
}
