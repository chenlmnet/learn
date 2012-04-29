package com.chenlm.learn.tjava.strings;

import java.util.Scanner;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-25 下午10:43:12
 */
public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12, 42, 78, 99, 42");
        scanner.useDelimiter("\\s*,\\s*");
        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}
