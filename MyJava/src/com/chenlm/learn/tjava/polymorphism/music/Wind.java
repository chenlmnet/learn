package com.chenlm.learn.tjava.polymorphism.music;

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
    // Redifine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
