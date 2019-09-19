
public class Board
	{

		

	static	String [][] board = new String[4][4];
		

		public static void addEmptySpaces()
			{	
				
				for(int row = 0; row < board.length; row++)
					{
					for(int col =0; col < board.length; col++)
					{
					board [row][col] = " ";
					}
					}	
				
			}

	}
