package com.chenlm.learn.tjava.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 下午7:58:31
 */
public class Resetting {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]")
                .matcher("fix the rug with bags");
        while (m.find())
            System.out.print(m.group() + " ");
        System.out.println();
        m.reset("fix the rig with rags");
        while (m.find())
            System.out.print(m.group() + " ");
    }
}
