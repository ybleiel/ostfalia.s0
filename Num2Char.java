package s0start;

import java.util.Scanner;

public class Num2Char
{
	public static void main(String[] args) 
	{
		int zahl;
		int a, b, c;
		char n1, n2, n3;
		Scanner keyboard = new Scanner(System.in);
 
		System.out.print("Geben sie eine Zahl ein: ");
		zahl = keyboard.nextInt();
		c = (zahl % 100);
		b = ((zahl % 10000) - (c)) / 100;
		a = (zahl - (b + c)) / 10000;
		n1 = (char) (a);
		n2 = (char) (b);
		n3 = (char) (c);
		System.out.print("decode = ");
		System.out.print(n1);
		System.out.print(n2);
		System.out.print(n3);
	}
}