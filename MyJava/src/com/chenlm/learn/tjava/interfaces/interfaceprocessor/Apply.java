package com.chenlm.learn.tjava.interfaces.interfaceprocessor;
import static com.chenlm.learn.tjava.util.Print.*;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
}
