package EX1;

public class Select_Item implements State{

	public void itemSelected(VendingMachine context) {
		context.selectedItemPrice = context.random.nextInt(10);
		System.out.println("Item Selected- Price:" + context.selectedItemPrice+" \nPlease Enter Coin Now");
		context.setState(new Insert_Coin());
	}

	public void coinInserted(VendingMachine context) {
		System.out.println("Please Select Item first");
	}

	public void itemDispensed(VendingMachine context) {
		System.out.println("Please Select Item first");
	}

	public void balanceDispensed(VendingMachine context) {
		System.out.println("Please Select Item first");
	}

	public void machineClosed(VendingMachine context) {
		System.out.println("Please Select Item first");
	}

	public void machineNotClosed(VendingMachine context) {
		System.out.println("Please Select Item first");
	}

	public void printStatus() {
		System.out.println("Select Item at this state");
	}



}
