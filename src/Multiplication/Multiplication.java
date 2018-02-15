package Multiplication;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[]args){


		Scanner scanner=new Scanner(System.in);

		System.out.println ("Enter number 1");
		int a= scanner.nextInt();
		System.out.println ("Enter number 2");
		int b= scanner.nextInt();

		int c=pNumbers(a,b);
		System.out.println("The product is " +c);
	}
	public static int pNumbers(int num1, int num2){

		int mult=num1*num2;
		return mult;
	}
}