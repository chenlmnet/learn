package com.chenlm.learn.tjava.typeinfo;

import static com.chenlm.learn.tjava.util.Print.print;
import static com.chenlm.learn.tjava.util.Print.printnb;

import com.chenlm.learn.tjava.typeinfo.pets.Pet;
import com.chenlm.learn.tjava.typeinfo.pets.Pets;
import com.chenlm.learn.tjava.util.TypeCounter;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午8:56:50
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
