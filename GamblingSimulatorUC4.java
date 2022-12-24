package gamblingSimulator;

import java.util.Scanner;

public class GamblingSimulatorUC4 {

	public static void main(String[] args) {

		int maximumWon[] = new int[100];
		int maximumLost[] = new int[100];

		Scanner sc = new Scanner(System.in);

		System.out.println(" Gambling Starts");
		System.out.println("Enter starting amount of Stake");
		int amountOfStake = sc.nextInt();

		System.out.println("Enter amount to bet");
		int betAmount = sc.nextInt();

		int totalAmount = 0;

		for (int i = 1; i <= 20; i++) {
			int cashInHand = amountOfStake;
			System.out.println("For day " + i);
			while (cashInHand > amountOfStake / 2 && cashInHand < amountOfStake * 1.5) {
				int play = 1 + (int) Math.floor(Math.random() * 10) % 2;
				System.out.println("Gamblers Play : " + play);
				switch (play) {
				case 1:
					cashInHand = cashInHand + betAmount;
					System.out.println("Total current cash gambler has " + cashInHand);
					System.out.println("Win bet on 1$");
					System.out.println();
					break;
				case 2:
					cashInHand = cashInHand - betAmount;
					System.out.println("Total current cash gambler has " + cashInHand);
					System.out.println("Looses bet on 1$");
					System.out.println();
					break;
				default:
					break;
				}

			}
			if (cashInHand == (amountOfStake / 2) || cashInHand == (amountOfStake * 1.5)) {
				System.out.println("Player would like to resign for current day" + i);

			}
			if (cashInHand > amountOfStake) {
				int amountWonPerDay = cashInHand - amountOfStake;
				System.out.println("Player won " + amountWonPerDay + "$ " + "till day " + i);
			} else if (cashInHand < amountOfStake) {
				int amountLostPerDay = amountOfStake - cashInHand;
				System.out.println("Player lost " + amountLostPerDay + "$ " + "till day " + i);
			}
			if (cashInHand == (amountOfStake * 1.5)) {
				maximumWon[i] = cashInHand;
			} else if (cashInHand == 50) {
				maximumLost[i] = cashInHand;
			}
			totalAmount = totalAmount + cashInHand;
			System.out.println("Total amount player has after 20 days gambling : " + totalAmount + "$");

		}
		sc.close();
	}

}
