// Direct field access is determined at compile time.
package com.chenlm.learn.tjava.polymorphism;

class Super {
    public int field = 0;
    public int getField() { return field; }
}

class Sub extends Super {
    public int field = 1;
    public int getField() { return field; }
    public int getSuperField() { return super.field; }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub(); // Upcast
        System.out.println("sup.filed = " + sup.field +
                ", sup.getFiled() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());
    }
}
