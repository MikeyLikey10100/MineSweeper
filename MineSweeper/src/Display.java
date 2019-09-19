import java.util.Scanner;
public class Display
	{

		public static void grid()
			{
								

				
		System.out.println("    1   2   3   4  ");
		System.out.println("  +---+---+---+---+");
		System.out.println("A | " + Board.board[0][0] +" | " +  Board.board[0][1] + " | " +  Board.board[0][2] + " | " +  Board.board[0][3] + " | ");
		System.out.println("  +---+---+---+---+");
		System.out.println("B | " + Board.board[1][0] +" | " +  Board.board[1][1] + " | " +  Board.board[1][2] + " | " +  Board.board[1][3] + " | ");
		System.out.println("  +---+---+---+---+");
		System.out.println("C | " + Board.board[2][0] +" | " +  Board.board[2][1] + " | " +  Board.board[2][2] + " | " +  Board.board[2][3] + " | ");
		System.out.println("  +---+---+---+---+");
		System.out.println("D | " + Board.board[3][0] +" | " +  Board.board[3][1] + " | " +  Board.board[3][2] + " | " +  Board.board[3][3] + " | ");
		System.out.println("  +---+---+---+---+");

		
			}

	}
