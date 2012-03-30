package com.chenlm.learn.tjava.initialization;
// Creating arrays with new.
import static com.chenlm.learn.tjava.util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        print("length of a = " + a.length);
        print(Arrays.toString(a));
    }
}
