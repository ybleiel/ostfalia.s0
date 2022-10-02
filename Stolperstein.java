package s0start;

import std.ui.MiniApp;
import java.awt.Color;
import java.util.Scanner;

public class Stolperstein extends MiniApp {
	public static void main(String[] args) {
		int b;
		int p1;
		int p2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geben sie die Breite für den Baustein ein:");
		b=keyboard.nextInt();
		p1 = ((30 - (3 * b)) / 2) + b;
		p2 = 30 - b;
		placeBrick(0, true, b, Color.BLUE);
		placeBrick(p1, true, b, Color.BLUE);
		placeBrick(p2, true, b, Color.BLUE);
	}
}
