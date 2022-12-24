package gamblingSimulator;

import java.util.Scanner;

public class GamblingSimulatorUC6 {
	static int totalAmountDiffInMonth = 0;

	public static void main(String[] args) {
		int maximumWon[] = new int[100];
		int maximumLost[] = new int[100];
		int month = 1;

		Scanner sc = new Scanner(System.in);
		boolean choice = true;
		while (choice) {
			System.out.println("Month " + month + " Gambling Starts");
			System.out.println("Enter starting amount of Stake");
			int amountOfStake = sc.nextInt();

			System.out.println("Enter amount to bet");
			int betAmount = sc.nextInt();

			int totalAmount = 0;

			for (int j = 1; j <= 20; j++) {
				int cashInHand = amountOfStake;
				System.out.println("For day " + j);
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
					System.out.println("Player would like to resign for current day" + j);

				}
				if (cashInHand > amountOfStake) {
					int amountWonPerDay = cashInHand - amountOfStake;
					System.out.println(
							"Player won " + amountWonPerDay + "$ " + "till day " + j + " of " + month + " month");
				} else if (cashInHand < amountOfStake) {
					int amountLostPerDay = amountOfStake - cashInHand;
					System.out.println(
							"Player lost " + amountLostPerDay + "$ " + "till day " + j + " of " + month + " month");
				}
				if (cashInHand == (amountOfStake * 1.5)) {
					maximumWon[j] = cashInHand;
				} else if (cashInHand == 50) {
					maximumLost[j] = cashInHand;
				}
				totalAmount = totalAmount + cashInHand;
			}
			System.out.println("Luckiest day Gambler Won maximum amount");
			for (int i = 1; i <= 20; i++) {
				if (maximumWon[i] == (amountOfStake * 1.5)) {
					System.out.println("Day " + i + " won " + maximumWon[i] + "$");
				}

			}
			System.out.println("Unluckiest day Gambler Lost maximum amount");
			for (int i = 1; i <= 20; i++) {
				if (maximumLost[i] == (amountOfStake / 2)) {
					System.out.println("Day " + i + " lost " + maximumLost[i] + "$");
				}

			}

			System.out.println("Total amount player has after 20 days gambling : " + totalAmount + "$");
			totalAmountDiffInMonth = totalAmount - amountOfStake * 20;
			if (totalAmountDiffInMonth > 0) {
				System.out.println("Do you want to continue playing for next month");
				System.out.println("If you want to continue playing press '1'");
				System.out.println("If you want to stop playing press '2'");
				int forPlay = sc.nextInt();
				if (forPlay == 1) {
					choice = true;
					month++;
				} else {
					choice = false;
					System.out.println("Thanks for playing");
				}
			} else {
				System.out.println("You are in Loss");
				System.out.println("Thanks For Playing");
				break;
			}

		}
		sc.close();
	}
}
