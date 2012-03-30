package com.chenlm.learn.tjava.initialization;
// Demonstration of both constructor
// and ordinary method overloading.

import static com.chenlm.learn.tjava.util.Print.*;

class Tree {
	int height;
	public Tree() {
		print("Planting a seedling");
		height = 0;
	}
	public Tree(int initialHeight) {
		height = initialHeight;
		print("Creating new Tree that is " +
			height + " feet tall");
	}
	void info() {
		print("Tree is " + height + " feet tall");
	}
	void info(String s) {
		print(s + ": Tree is " + height + " feet tall");
	}
}
public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		// Overloaded constructor:
		new Tree();
	}
}
