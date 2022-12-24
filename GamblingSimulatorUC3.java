package gamblingSimulator;

import java.util.Scanner;

public class GamblingSimulatorUC3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Gambling Starts");
		System.out.println("Enter starting amount of Stake");
		int amountOfStake = sc.nextInt();
		System.out.println("Enter amount to bet");
		int betAmount = sc.nextInt();
		int cashInHand = amountOfStake;
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
			System.out.println("Player would like to resign for current day");

		}
		sc.close();
	}

}
