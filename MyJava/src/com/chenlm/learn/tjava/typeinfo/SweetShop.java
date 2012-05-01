// Examination of the way the class loader works.
package com.chenlm.learn.tjava.typeinfo;
import static com.chenlm.learn.tjava.util.Print.*;

class Candy {
    static { print("Loading Candy"); }
}

class Gum {
    static { print("Loading Gum"); }
}

class Cookie {
    static { print("Loading Cookie"); }
}

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-29 下午9:12:17
 */
public class SweetShop {
    public static void main(String[] args) {
        print("inside main");
        new Candy();
        print("After creating Candy");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }
}
