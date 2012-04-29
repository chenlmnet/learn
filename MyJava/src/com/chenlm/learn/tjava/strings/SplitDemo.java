package com.chenlm.learn.tjava.strings;

import static com.chenlm.learn.tjava.util.Print.print;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 下午6:11:37
 */
public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // Only do the first three:
        print(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
}
