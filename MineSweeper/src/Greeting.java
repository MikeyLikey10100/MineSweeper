import java.util.Scanner;
public class Greeting
	{

		public static void greeting()
			{
			Scanner userInput = new Scanner (System.in); 

			System.out.println("Hello, what is your name");
			
			String name = userInput.nextLine();
			
			System.out.println("Hello " + name + ". Welcome to MineSweeper.");
			}

	}
