package com.chenlm.learn.tjava.control;
import static com.chenlm.learn.tjava.util.Print.*;

public class IfElse2 {
	static int test(int testval, int target) {
		if (testval > target) {
			return +1;
		} else if (testval < target) {
			return -1;
		} else {
			return 0; // Match
		}
	}
	public static void main(String[] args) {
		print(test(10, 5));
		print(test(5, 10));
		print(test(5, 5));
	}
}
