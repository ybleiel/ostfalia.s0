
package s0start;

import std.ui.MiniApp;
import java.awt.Color;

public class Steinreihe extends MiniApp {
	public static void main(String[] args) {
		placeBrick(0, true, 8, Color.BLUE);
		placeBrick(8, true, 6, Color.BLUE);
		placeBrick(14, true, 4, Color.BLUE);
		placeBrick(18, true, 3, Color.BLUE);
		placeBrick(21, true, 2, Color.BLUE);
		placeBrick(23, true, 1, Color.BLUE);
		placeBrick(29, false, 6, Color.BLUE);
	}
}