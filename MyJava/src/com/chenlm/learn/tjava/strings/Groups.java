package com.chenlm.learn.tjava.strings;
import static com.chenlm.learn.tjava.util.Print.print;
import static com.chenlm.learn.tjava.util.Print.printnb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-22 下午1:52:49
 */
public class Groups {
    static public final String POEM =
            "Twas brilling, and the slithy toves\n" +
            "Did gyre and gimble in the wabe.\n" +
            "All mimsy were the borogoves,\n" +
            "And the mome raths outgrabe.\n\n" +
            "Beware the Jabberwock, my son,\n" +
            "The jaws that bite, the claws that catch.\n" +
            "Beware the Jubjub bird, and shun\n" +
            "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Matcher m =
                Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                    .matcher(POEM);
        while (m.find()) {
            for (int j = 0; j <= m.groupCount(); j++) {
                printnb("[" + m.group(j) + "]");
            }
            print();
        }
    }
}
