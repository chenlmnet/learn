package com.chenlm.learn.tjava.operators;
// Demonstrates the ++ and -- operator
import static com.chenlm.learn.tjava.util.Print.*;

public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		print("i : " + i);
		print("++i : " + ++i);
		print("i++ : " + i++);
		print("i : " + i);
		print("--i : " + --i);
		print("i-- : " + i--);
		print("i : " + i);
	}
}
