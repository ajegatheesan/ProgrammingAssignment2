import java.util.Scanner;

class topics
{
	public static void main(String[] args)
	{

		String[] topics = new String[5];
		topics[0] = "Government Politics";
		topics[1] = "Global Environment";
		topics[2] = "Weather Conditions";
		topics[3] = "School-related issue";
		topics[4] = "American economy";
		int[][] results = new int[5][10];
		int loop = 1, userChoice, NoUsers = 0;
		double minMaxAverage[] = { 0, 0, 0, 0, 0 };
		double max;
		double min;
		int i;
		int j;

		Scanner input = new Scanner(System.in);

		while (loop == 1)
		{
			for (j = 0; j < 5; j++)
			{
				System.out.println("Choose a rating for:" + topics[j] + " (1-10)");
				userChoice = input.nextInt();
				minMaxAverage[j] += userChoice;
				results[j][userChoice-1]++;
			}
			NoUsers++;
			System.out.printf("Enter 1 for the next user, or 0 to be finished.");
			loop = input.nextInt();
			System.out.println();
		}

		for (i = 0; i < 5; i++) 
		{
			System.out.print( topics[i] + "	");
			for (j = 0; j < 10; j++)
			{
				System.out.print(results[i][j] + "	");
			}
			System.out.println("Avg: "+(minMaxAverage[i]/NoUsers));
		}

		max = minMaxAverage[0];
		min = minMaxAverage[0];

		for (i = 1; i < 5; i++) 
		{
			if (minMaxAverage[i] > max)
			{
				max = minMaxAverage[i];
			}
			if (minMaxAverage[i] < min) 
			{
				min = minMaxAverage[i];
			}
		}
		System.out.println();
		for (i = 0; i < 5; i++) 
		{
			if (minMaxAverage[i] == max) 
			{
				System.out.printf("\n%s had the highest amount of points.\n", topics[i]);
			}
		}
		System.out.println();
		for (i = 0; i < 5; i++) 
		{
			if (minMaxAverage[i] == min)
			{
				System.out.printf("\n%s had the least amount of points.\n", topics[i]);
			}
		}

	}
}