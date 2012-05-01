package com.chenlm.learn.tjava.typeinfo;

import java.lang.reflect.Method;

import com.chenlm.learn.tjava.typeinfo.interfacea.A;
import com.chenlm.learn.tjava.typeinfo.packageaccess.HiddenC;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-5-1 上午8:39:21
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        // Compile error: cannot find symbol 'C':
        /*if (a instanceof C) {
            C c = (C)a;
            c.g();
        }*/
        // Oops! Reflection still allows us to call g();
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
    static void callHiddenMethod(Object a, String methodName)
    throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
