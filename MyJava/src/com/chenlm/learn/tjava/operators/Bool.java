package com.chenlm.learn.tjava.operators;
// Relational and logical operators

import java.util.Random;
import static com.chenlm.learn.tjava.util.Print.*;

public class Bool {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i = " + i);
		print("j = " + j);
		print("i > j is " + (i > j));
		print("i < j is " + (i < j));
		print("i >= j is " + (i >= j));
		print("i <= j is " + (i <= j));
		print("i == j is " + (i == j));
		print("i != j is " + (i != j));
		
		print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		print("(i > 10) || (j > 10) is " + ((i > 10) || (j > 10)));
	}
}
