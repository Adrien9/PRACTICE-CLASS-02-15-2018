package EvenOdd;

import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println ("Enter a number");

		int num = scanner.nextInt();

		String type = EO(num);

		System.out.println ("The output is " + type );

	}

	public static String EO (int y)	{



		if ((y % 2) == 0)
		{
			return "true"  ;
		}

		else 
		{
			return "false";
		}

	}
}