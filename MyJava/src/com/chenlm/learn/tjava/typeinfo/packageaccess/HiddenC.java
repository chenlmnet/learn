package com.chenlm.learn.tjava.typeinfo.packageaccess;

import static com.chenlm.learn.tjava.util.Print.print;

import com.chenlm.learn.tjava.typeinfo.interfacea.A;

class C implements A {
    public void f() { print("public C.f()"); }
    public void g() { print("public C.g()"); }
    void u() { print("package C.u()"); }
    protected void v() { print("protected C.v()"); }
    private void w() { print("private C.w()"); }
}

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-5-1 上午8:35:43
 */
public class HiddenC {
    public static A makeA() { return new C(); }
}
