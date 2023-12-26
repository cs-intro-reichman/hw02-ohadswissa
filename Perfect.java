/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int sum = 0;
		int max = 0;
		int j = a - 1;
		boolean maximal = false;
		//find the maximal divisor for taking the last '+' out of the string
		while ( maximal == false)
		{
			if (a % j == 0)
			{
				max = j;
				maximal = true;
			}
			j--;
		}

		String s ="";
		for (int i = 1; i < a; i++)
		{
			if (a % i == 0) 
			{
				sum = sum + i;
				if (i == max) s = s + i;
				else s = s + i + " + ";
			}
		}
        int place = s.length();
		if (sum == a)
		{
			//s = s - s.charAt(s-1);
			System.out.println(a+" is a perfect number since "+ a + " = "+ s);
		}	
		else System.out.println(a+" is not a perfect number");	
	}
}
