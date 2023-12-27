/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int row = 1;
		for (int i=1; i<=a; i++) //colums
		{
			for (int j=1; j<=a; j++) //rows
			{
				if (row % 2 ==0) System.out.print(" *");
				else System.out.print("* ");	

			}
        System.out.println();
		row++;
		}		
	}
}
