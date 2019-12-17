package EX2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		ATM_Machine atm = new ATM_Machine();
		Scanner myScan = new Scanner(System.in);
		while (true) {
			printMenu();
			int choice = myScan.nextInt();
			if (choice == 1) {
				atm.cancelPressed();

			} else if (choice == 2) {
				atm.pinEntered(1234);

			} else if (choice == 3) {
				atm.cardRead();

			} else if (choice == 4) {
				atm.cardNotReadable();

			} else if (choice == 5) {
				atm.viewBalance();

			} else if (choice == 6) {
				atm.withdrawCash();

			} else if (choice == 7) {
				atm.depositFunds();

			} else if (choice == 8) {
				atm.customerFinished();

			} else if (choice == 9) {
				atm.anotherTransaction();
			} else if (choice == 0) {
				break;
			}

		}
	}

	static void printMenu() {
		System.out.println("1 cancel Press " + "\n2 pin Entered(int pin)" + "\n3 cardRead();" + 
	"\n4 card Not Readable();"
				+ "\n5 view Balance();" + "\n6 withdraw Cash();" + "\n7 depositFunds();" + 
	"\n8 customerFinished();"
				+ "\n9 anotherTransaction();" + "\n0 Exit");
	}
}
