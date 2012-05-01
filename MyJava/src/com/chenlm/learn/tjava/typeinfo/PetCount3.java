// Using inInstance()
package com.chenlm.learn.tjava.typeinfo;

import static com.chenlm.learn.tjava.util.Print.print;
import static com.chenlm.learn.tjava.util.Print.printnb;

import java.util.LinkedHashMap;
import java.util.Map;

import com.chenlm.learn.tjava.typeinfo.pets.LiteralPetCreator;
import com.chenlm.learn.tjava.typeinfo.pets.Pet;
import com.chenlm.learn.tjava.typeinfo.pets.Pets;
import com.chenlm.learn.tjava.util.MapData;

/**
 * 
 * @author Chenlm
 * @version 创建时间: 2012-4-30 上午8:34:34
 */
public class PetCount3 {
    static class PetCounter
    extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.map(LiteralPetCreator.allTypes, 0));
        }
        public void count(Pet pet) {
            // Class.isInstance() eliminates instanceofs:
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }
        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }
    public static void main(String[] args) {
        PetCounter petCount = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            petCount.count(pet);
        }
        print();
        print(petCount);
    }
}
