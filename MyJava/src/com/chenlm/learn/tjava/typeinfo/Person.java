// A class with a Null Object.
package com.chenlm.learn.tjava.typeinfo;

import com.chenlm.learn.tjava.util.Null;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 下午9:36:52
 */
public class Person {
    public final String first;
    public final String last;
    public final String address;
    // etc.
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }
    public static class NullPerson
    extends Person implements Null {
        private NullPerson() { super("None", "None", "None"); }
        public String toString() { return "NullPerson"; }
    }
    public static final Person NULL = new NullPerson();
}
