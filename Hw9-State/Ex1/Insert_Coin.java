package EX1;

public class Insert_Coin implements State {
	public void itemSelected(VendingMachine context) {
		System.out.println("Please Insert Coin");
	}

	public void coinInserted(VendingMachine context) {
		context.enteredAmount += context.random.nextInt(6);
		System.out.println("Total Inserted Amount: " + context.enteredAmount);
		if (context.enteredAmount >= context.selectedItemPrice) {
			System.out.println("Dispensing Item");
			context.setState(new Dispense_Item());
		}else {
			System.out.println("Insert more coins to get item");
		}
	}

	public void itemDispensed(VendingMachine context) {
		System.out.println("Please Insert Coin");
	}

	public void balanceDispensed(VendingMachine context) {
		System.out.println("Please Insert Coin");
	}

	public void machineClosed(VendingMachine context) {
		System.out.println("Please Insert Coin");
	}

	public void machineNotClosed(VendingMachine context) {
		System.out.println("Please Insert Coin");
	}

	public void printStatus() {
		System.out.println("Waiting for Coin$");
	}
}
