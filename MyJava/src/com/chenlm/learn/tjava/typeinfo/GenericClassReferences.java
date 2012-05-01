package com.chenlm.learn.tjava.typeinfo;
/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午6:56:38
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
}
