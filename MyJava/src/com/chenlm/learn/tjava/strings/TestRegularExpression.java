// Allows you to easily try out regular expressions.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }
package com.chenlm.learn.tjava.strings;

import static com.chenlm.learn.tjava.util.Print.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 下午12:05:37
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            print("Usage:\njava TestRugularExpression " +
            		"characterSequence regularExperssion+");
            System.exit(0);
        }
        print("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " +
                		m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
