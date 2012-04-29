package com.chenlm.learn.tjava.strings;

import static com.chenlm.learn.tjava.util.Print.print;
import static com.chenlm.learn.tjava.util.Print.printnb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 下午1:10:04
 */
public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet's wings");
        while(m.find())
            printnb(m.group() + " ");
        print();
        int i = 0;
        while (m.find(i)) {
            printnb(m.group() + " ");
            i++;
        }
    }
}
