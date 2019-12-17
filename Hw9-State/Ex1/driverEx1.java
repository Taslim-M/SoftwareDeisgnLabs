package EX1;

public class driverEx1 {
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.printCurrentStateStatus();
		vendingMachine.itemSelected();
		vendingMachine.coinInserted(); // to ensure enough coins inserted
		vendingMachine.coinInserted();
		vendingMachine.coinInserted();
		vendingMachine.itemDispensed();
		vendingMachine.balanceDispensed();
		vendingMachine.machineNotClosed();
		
		vendingMachine.itemSelected();
		vendingMachine.coinInserted(); //this may fail and we never move to the other states
		vendingMachine.itemDispensed();
		vendingMachine.balanceDispensed();
		vendingMachine.machineClosed();
	}
}
