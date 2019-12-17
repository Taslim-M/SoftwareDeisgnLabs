package EX1;

public interface State {
	public void itemSelected(VendingMachine context);
	public void coinInserted(VendingMachine context);
	public void itemDispensed(VendingMachine context);
	public void balanceDispensed(VendingMachine context);
	public void machineClosed(VendingMachine context);
	public void machineNotClosed(VendingMachine context);
	public void printStatus();
}
