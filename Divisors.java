
public class Divisors {
	public static void main (String[] args) {
		//insert a number
		int a = Integer.parseInt(args[0]);
		for (int i = 1; i <= a; i++)
		{
			if (a % i == 0) System.out.println(i);
		}

	}
}
