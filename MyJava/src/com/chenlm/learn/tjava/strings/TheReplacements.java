package com.chenlm.learn.tjava.strings;

import static com.chenlm.learn.tjava.util.Print.print;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.chenlm.learn.tjava.util.TextFile;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 下午6:19:04
 */

/*! Here's a block of text to use as input to
    the regular expression matcher.Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block. !*/

public class TheReplacements {
    public static void main(String[] args) {
        String s = TextFile.read("src/com/chenlm/learn/tjava/strings/" +
        		"TheReplacements.java");
        // Match the specially commented block of text above:
        Matcher mInput =
                Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
                    .matcher(s);
        if (mInput.find())
            s = mInput.group(1); // Captured by parentheses
        // Replace two or more space with a single space:
        s = s.replaceAll(" {2,}", " ");
        // Replace two or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode:
        s = s.replaceAll("(?m)^ +", "");
        print(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        // Process the find information as you
        // perform the replacement:
        while (m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        // Put in the remainder of the text:
        m.appendTail(sbuf);
        print(sbuf);
    }
}
