package com.chenlm.learn.tjava.util;

public class Range {
	public static int[] range(int i) {
		int[] ins = new int[i];
		for (int j = 0; j < ins.length; j++) {
			ins[j] = j;
		}
		return ins;
	}
	
	public static int[] range(int begin, int end) {
		int[] ins = new int[end - begin];
		for (int i = 0; i < ins.length; i++) {
			ins[i] = begin + i;
		}
		return ins;
	}
	
	public static int[] range(int begin, int end, int step) {
		int[] ins = new int[(end - begin)/step];
		for (int i = 0; i < ins.length; i++) {
			ins[i] = begin + i * step;
		}
		return ins;
	}
}
