package com.chenlm.learn.tjava.innerclasses;

public class DotNew {
    public class Inner {
        Inner() {
            System.out.println("DotNew.Inner constructor");
        }
    }
    DotNew() {
        System.out.println("DotNew constructor");
    }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
