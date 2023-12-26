
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean stop = false;
		int boy = 0;
		int girl = 0;
		int children = 0;
		double num1 = 0;
		while (stop == false) 
		{
		  num1 = Math.random();
		  if (num1 > 0.5)
		  {
		 	girl++;
		    System.out.print("g ");
		  }
		  else 
		  {
		 	boy++;
		 	System.out.print("b ");
		  }
		  if (boy>=1 && girl>=1)
		  {
		  System.out.println();
		  stop = true;
		 }
		}
		children = boy + girl;
		System.out.println("You made it... and you now have "+children+" children.");
		}	

	}

