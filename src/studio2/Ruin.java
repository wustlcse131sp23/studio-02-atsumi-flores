package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int startAmount = in.nextInt();
		System.out.println("Start Amount: " +startAmount);
		
		double winChance = in.nextDouble();
		System.out.println("Win Chance: " + winChance);
		
		int winLimit = in.nextInt();
		System.out.println("Win Limit: " + winLimit);
		int wins = 0;
		int loses = 0;
		int money;
		int totalSimulations= in.nextInt();
		System.out.println("Total Simulations: " + totalSimulations );
		while (totalSimulations > 0)
		{
			if (totalSimulations > 0)
			{
				money = startAmount; 
				while (money > 0)	
				{
					if (Math.random() <= winChance)
					{
						money ++;
						
					}
						else
							{
							money --;
							}
					if (money == winLimit)
					{
						money = -1;
						wins ++;
						System.out.println (" Win on Simulation:" + totalSimulations);
						}
					if (money == 0)
					{
						loses ++;
						System.out.println (" Lose on Simulation:" + totalSimulations);
					}
				}
			
			}
			totalSimulations--;
		}
		System.out.println("Number of Wins: " + wins);
		System.out.println("Number of Loses: " + loses);
	}
}
