package com.chenlm.learn.tjava.strings;
/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 上午11:22:28
 */
public class Rudolph {
    public static void main(String[] args) {
        for (String pattern : new String[] { "Rudolph",
                "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" }) {
            System.out.println("Rudolph".matches(pattern));
        }
    }
}
