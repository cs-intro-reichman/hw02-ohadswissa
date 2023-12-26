/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//insert a string
		String s = args [0];
		String rev = "";
		int n = s.length()-1;
		int mid = s.length()/2;
		while (n >= 0)
		{
			rev = rev + s.charAt(n);
			n--;

		}
	System.out.println(rev);
	System.out.println("The middle character is "+ s.charAt(mid));



	}
}
