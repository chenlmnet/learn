package com.chenlm.learn.tjava.holding;

import java.util.Set;
import java.util.TreeSet;

import com.chenlm.learn.tjava.util.TextFile;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src/com/chenlm/learn/tjava/holding/SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
