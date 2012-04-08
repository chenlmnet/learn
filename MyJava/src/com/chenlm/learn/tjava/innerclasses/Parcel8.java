// Calling the base-class constructor.
package com.chenlm.learn.tjava.innerclasses;

public class Parcel8 {
    public Wrapping wrapping(int x) { // Pass constructor argument.
        // Base constructor call:
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }
    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }
}
