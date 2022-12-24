package gamblingSimulator;

import java.util.Scanner;

public class GamblingSimulatorUC1 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean choice = true;
		while (choice) {
			System.out.println(" Gambling Starts");
			System.out.println("Enter starting amount of Stake");
			int amountOfStake = sc.nextInt();
			System.out.println("Enter amount to bet");
			int betAmount = sc.nextInt();
		}
	}

}
