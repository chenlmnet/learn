package com.chenlm.learn.tjava.typeinfo;
/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午7:07:44
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
