/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		double sum = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i=1; i<=a; i++)
		{
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
		      }
		      else 
		      {
		 	  boy++;
		      }
		      if (boy>=1 && girl>=1)
		      {
		      stop = true;
		      }
		   }
		   children = boy + girl;
		   sum = sum + children;
		   if (children == 2) count2++;
		   if (children == 3) count3++;
		   if (children >= 4) count4++;
	    }
	    int max = Math.max(count2,count3); 
		int maximal = Math.max(max,count4);
		System.out.println("Average: "+sum/a+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+count2);
		System.out.println("Number of families with 3 children: "+count3);
		System.out.println("Number of families with 4 or more children: "+count4);
		System.out.println("The most common number of children is "+maximal);



		
		}	
	}

