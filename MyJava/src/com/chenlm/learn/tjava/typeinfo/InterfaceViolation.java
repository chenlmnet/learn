// Sneaking around an interface.
package com.chenlm.learn.tjava.typeinfo;

import com.chenlm.learn.tjava.typeinfo.interfacea.A;

class B implements A {
    public void f() {}
    public void g() {}
}

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-5-1 上午8:32:38
 */
public class InterfaceViolation {
    public static void main(String[] args) {
        A a = new B();
        a.f();
        // a.g(); // Compile error
        System.out.println(a.getClass().getName());
        if (a instanceof B) {
            B b = (B)a;
            b.g();
        }
    }
}
