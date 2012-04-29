package com.chenlm.learn.tjava.strings;

import static com.chenlm.learn.tjava.util.Print.print;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 上午8:56:20
 */
public class Replacing {
    static String s = Splitting.knights;
    public static void main(String[] args) {
        print(s.replaceFirst("f\\w+", "located"));
        print(s.replaceAll("shrubbery|tree|herring", "banana"));
    }
}
