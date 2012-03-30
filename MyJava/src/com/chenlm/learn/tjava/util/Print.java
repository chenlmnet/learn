// Print methods that can be used without
// qualifiers, using Java SE5 static imports:
package com.chenlm.learn.tjava.util;
import java.io.PrintStream;

public class Print {
    // Print a newline by itself:
	public static void print() {
		System.out.println("");
	}
	// Print with a newline:
	public static void print(Object obj) {
		System.out.println(obj);
	}
	// Print with no line break:
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
	// The new Java SE5 printf() (from C):
	public static PrintStream printf(String format, Object...args) {
        return System.out.printf(format, args);
    }
	
	public static void printBinaryInt(String str, int i) {
		System.out.println(str + ", int: " + Integer.toString(i) + ", binary:");
		System.out.println("    " + Integer.toBinaryString(i));
	}
	public static void printBinaryLong(String str, long i) {
		System.out.println(str + ", int: " + Long.toString(i) + ", binary:");
		System.out.println("    " + Long.toBinaryString(i));
	}
}
