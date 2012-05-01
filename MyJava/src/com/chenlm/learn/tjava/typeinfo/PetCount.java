// Using instanceof.
package com.chenlm.learn.tjava.typeinfo;

import static com.chenlm.learn.tjava.util.Print.print;
import static com.chenlm.learn.tjava.util.Print.printnb;

import java.util.HashMap;

import com.chenlm.learn.tjava.typeinfo.pets.Cat;
import com.chenlm.learn.tjava.typeinfo.pets.Cymric;
import com.chenlm.learn.tjava.typeinfo.pets.Dog;
import com.chenlm.learn.tjava.typeinfo.pets.EgyptianMau;
import com.chenlm.learn.tjava.typeinfo.pets.ForNameCreator;
import com.chenlm.learn.tjava.typeinfo.pets.Hamster;
import com.chenlm.learn.tjava.typeinfo.pets.Manx;
import com.chenlm.learn.tjava.typeinfo.pets.Mouse;
import com.chenlm.learn.tjava.typeinfo.pets.Mutt;
import com.chenlm.learn.tjava.typeinfo.pets.Pet;
import com.chenlm.learn.tjava.typeinfo.pets.PetCreator;
import com.chenlm.learn.tjava.typeinfo.pets.Pug;
import com.chenlm.learn.tjava.typeinfo.pets.Rat;
import com.chenlm.learn.tjava.typeinfo.pets.Rodent;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午7:51:40
 */
public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }
    public static void
    countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            // List each individual pet:
            printnb(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");
            if (pet instanceof Dog)
                counter.count("Dog");
            if (pet instanceof Mutt)
                counter.count("Mutt");
            if (pet instanceof Pug)
                counter.count("Pug");
            if (pet instanceof Cat)
                counter.count("Cat");
            if (pet instanceof EgyptianMau)
                counter.count("EgyptianMau");
            if (pet instanceof Manx)
                counter.count("Manx");
            if (pet instanceof Cymric)
                counter.count("Cymric");
            if (pet instanceof Rodent)
                counter.count("Rodent");
            if (pet instanceof Rat)
                counter.count("Rat");
            if (pet instanceof Mouse)
                counter.count("Mouse");
            if (pet instanceof Hamster)
                counter.count("Hamster");
        }
        // Show the counts:
        print();
        print(counter);
    }
    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
