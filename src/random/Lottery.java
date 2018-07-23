package random;

import java.util.Random;

public class Lottery {
	public static void main(String[] args) {
		int r = 0;
		Random randy = new Random();
		int r1 = randy.nextInt(151);
		int r2 = randy.nextInt(276);
		int r3 = randy.nextInt(51) + 50;
		int r4 = randy.nextInt(236) + 192;
		int r5 = randy.nextInt();
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + "");

	}
}
