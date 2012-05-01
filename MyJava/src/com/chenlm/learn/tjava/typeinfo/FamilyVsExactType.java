// The difference between instanceof and class
package com.chenlm.learn.tjava.typeinfo;

import static com.chenlm.learn.tjava.util.Print.*;

class Base {}
class Derived extends Base {}

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 下午6:11:39
 */
public class FamilyVsExactType {
    static void test(Object x) {
        print("Testing x of type " + x.getClass());
        print("x instanceof Base " + (x instanceof Base));
        print("x instanceof Derived " + (x instanceof Derived));
        print("Base.isInstance(x) " + Base.class.isInstance(x));
        print("Derived.isInstance(x) " +
                Derived.class.isInstance(x));
        print("x.getClass() == Base.class " +
                (x.getClass() == Base.class));
        print("x.getClass() == Derived.class " +
                (x.getClass() == Derived.class));
        print("x.getClass().equals(Base.class) " +
                (x.getClass().equals(Base.class)));
        print("x.getClass().equals(Derived.class) " +
                (x.getClass().equals(Derived.class)));
    }
    public static void main(String[] args) {
        test(new Base());
        test(new Derived());
    }
}
