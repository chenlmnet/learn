package com.chenlm.learn.tjava.typeinfo;

class Building {}
class House extends Building {}

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午7:38:47
 */
public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House)b; // ... or just do this.
    }
}
