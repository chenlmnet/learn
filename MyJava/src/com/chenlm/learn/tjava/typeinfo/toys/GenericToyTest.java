package com.chenlm.learn.tjava.typeinfo.toys;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午7:21:55
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;
        // Produces exact type;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // This won't compile:
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Only produces Objects:
        Object obj = up.newInstance();
    }
}
