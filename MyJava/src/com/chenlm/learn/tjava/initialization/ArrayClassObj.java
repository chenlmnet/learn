package com.chenlm.learn.tjava.initialization;
import static com.chenlm.learn.tjava.util.Print.*;

import java.util.Arrays;
import java.util.Random;

// Creating an array of nonprimitive objects.
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length of a = " + a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(500);
        }
        print(Arrays.toString(a));
    }
}
