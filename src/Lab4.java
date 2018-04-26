import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Declare variables. 
		int num;
		int numSquared;
		int numCubed;
		
		//Declare variable to allow "continue" option. 
		String cont = "y";

		System.out.println("Learn your squares and cubes!");
		System.out.println();

		//While loop to allow "continue" option. 
		while (cont.equalsIgnoreCase("y")) {

			//Prompt for and obtain input, assign to num.
			System.out.print("Enter an integer: ");
			num = scan.nextInt();
			System.out.println();

			//If statement used to ensure num is a valid entry -- a number greater than 0).
			if (num > 0) {
				
				//Format table headers and output to console.
				System.out.printf("%-8s %-10s %-10s", "Number", "Squared", "Cubed");
				System.out.println();

				System.out.printf("%-8s %-10s %-10s", "======", "======", "======");
				System.out.println();

				//For loop beginning at 1 and iterating up to num.
				for (int i = 1; i <= num; i++) {
					
					//Math used to determine num squared and num cubed.
					numSquared = (i * i);
					numCubed = (i * i * i);

					//Output i, numsquared, numcubed (calculated above) and output to console in table format. 
					System.out.printf("%-8d %-10d %-10d", i, numSquared, numCubed);
					System.out.println();
				}
			}
			//Prompt user if they want to continue, obtain input. 
			System.out.println();
			System.out.print("Continue? (y/n): ");
			cont = scan.next();
			System.out.println();

		}
		scan.close();
		
		//Message notifying user that the program has ended. 
		System.out.println("Bye!");
	}
}
