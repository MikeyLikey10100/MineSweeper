
public class driver
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
			
			Greeting.greeting();
			Board.addEmptySpaces();
			
			Board.board[2][3]= "b";
			Board.board[0][1]= "b";
			Display.grid();
			}

	}
