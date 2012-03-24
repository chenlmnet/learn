package com.chenlm.learn.tjava.util;

import java.util.Date;

public class Print {
	public static void print() {
		System.out.println("");
	}
	public static void print(String str) {
		System.out.println(str);
	}
	public static void print(Date date) {
		System.out.println(date);
	}
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(Long l) {
		System.out.println(l);
	}
	public static void printnb(String str) {
		System.out.print(str);
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
