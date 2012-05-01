// Anonymous inner class can't hide from reflection.
package com.chenlm.learn.tjava.typeinfo;

import static com.chenlm.learn.tjava.util.Print.print;

import com.chenlm.learn.tjava.typeinfo.interfacea.A;

class AnonymousA {
    public static A makeA() {
        return new A() {
            public void f() { print("public C.f()"); }
            public void g() { print("public C.g()"); }
            void u() { print("package C.u()"); }
            protected void v() { print("protected C.v()"); }
            private void w() { print("private C.w()"); }
        };
    }
}

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-5-1 上午9:06:13
 */
public class AnonymousImplementation {
    public static void main(String[] args) throws Exception {
        A a = AnonymousA.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Reflection still gets into the anonymous class:
        HiddenImplementation.callHiddenMethod(a, "g");
        HiddenImplementation.callHiddenMethod(a, "u");
        HiddenImplementation.callHiddenMethod(a, "v");
        HiddenImplementation.callHiddenMethod(a, "w");
    }
}
