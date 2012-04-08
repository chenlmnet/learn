// An anonymous inner class that performs
// initialization. A briefer version of Percel5
package com.chenlm.learn.tjava.innerclasses;

public class Parcel9 {
    // Argument must be final to use inside
    // anonymous inner class:
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
       Parcel9 p = new Parcel9();
       Destination d = p.destination("Tasmania");
    }
}
