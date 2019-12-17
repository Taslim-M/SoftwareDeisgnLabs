package EX2;

public interface PossibleState {
	public void cancelPressed();
	public void pinEntered(int pin);
	public void cardRead();
	public void cardNotReadable();
	public void viewBalance();
	public void withdrawCash();
	public void depositFunds();
	public void customerFinished();
	public void anotherTransaction();
}
