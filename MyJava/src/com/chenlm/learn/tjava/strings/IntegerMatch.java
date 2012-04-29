package com.chenlm.learn.tjava.strings;
/**
 *
 * @author Chenlm
 * @version 创建时间: 2012-4-22 上午8:37:43
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
