package EX1;

public class Close_Machine implements State {
	public void itemSelected(VendingMachine context) {
		System.out.println("Plz decide on machine closure");
	}

	public void coinInserted(VendingMachine context) {
		System.out.println("Plz decide on machine closure");
	}

	public void itemDispensed(VendingMachine context) {
		System.out.println("Plz decide on machine closure");
	}

	public void balanceDispensed(VendingMachine context) {
		System.out.println("Plz decide on machine closure");
	}

	public void machineClosed(VendingMachine context) {
		System.out.println("Machine Closing: Good bye");
		context.isClosed = true;
	}

	public void machineNotClosed(VendingMachine context) {
		System.out.println("Starting over: Select State");
		context.setState(new Select_Item());
	}

	public void printStatus() {
		System.out.println("Deiciding on machine closure");
	}
}
