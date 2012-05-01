package com.chenlm.learn.tjava.typeinfo;
/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午7:08:46
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
    }
}
