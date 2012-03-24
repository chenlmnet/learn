package com.chenlm.learn.tjava.operators;
import static com.chenlm.learn.tjava.util.Print.*;

public class StringOperators {
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z);
		print(x + " " + s);// convert x to a string
		s += "(sumed) = ";
		print(s + (x + y + z));
		print("" + x);
	}
}
