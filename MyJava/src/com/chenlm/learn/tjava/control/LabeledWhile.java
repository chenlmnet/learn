package com.chenlm.learn.tjava.control;
import static com.chenlm.learn.tjava.util.Print.*;

public class LabeledWhile {
	public static void main(String[] args) {
		int i = 0;
		outer:
			while (true) {
				i++;
				print("i = " + i);
				if (i == 1) {
					print("continue");
					continue;
				}
				if (i == 3) {
					print("continue outer");
					continue outer;
				}
				if (i == 5) {
					print("break");
					break;
				}
				if (i == 7) {
					print("break outer");
					break outer;
				}
			}
	}
}
