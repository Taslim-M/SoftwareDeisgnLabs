package EX2;

public class Reading_Pin implements PossibleState {
	private ATM_Machine context;

	public Reading_Pin(ATM_Machine m) {
		this.context = m;
	}

	@Override
	public void cancelPressed() {
		context.setCurrentState(context.getEjecting_Card());
	}

	@Override
	public void pinEntered(int pin) {
		if (pin == 1234) {
			System.out.println("Correct Pin. Authorized! Balance: " + context.getCurrentAccountBalance());
			context.setCurrentState(context.getChoosing_Transaction());
		}else
		{
			System.out.println("Wrong pin.. Attempts: " + context.numberOfPinTries);
			if(context.numberOfPinTries>5) {
				System.out.println("Too many wrong attempts");
				context.setCurrentState(context.getAbort());
			}
		}
	}

	@Override
	public void cardRead() {
		System.out.println("Already read ..");
	}

	@Override
	public void viewBalance() {
		System.out.println("Wait for correct pin ..");
	}

	@Override
	public void withdrawCash() {
		System.out.println("Wait for correct pin ..");
	}

	@Override
	public void depositFunds() {
		System.out.println("Wait for correct pin ..");
	}

	@Override
	public void customerFinished() {
		System.out.println("Wait for correct pin ..");
	}

	@Override
	public void anotherTransaction() {
		System.out.println("Wait for correct pin ..");
	}

	@Override
	public void cardNotReadable() {
		System.out.println("Already read correctly ..");
	}

}
