package com.chenlm.learn.tjava.holding;

import static com.chenlm.learn.tjava.util.Print.print;

import java.util.HashMap;
import java.util.Map;

import com.chenlm.learn.tjava.typeinfo.pets.Cat;
import com.chenlm.learn.tjava.typeinfo.pets.Dog;
import com.chenlm.learn.tjava.typeinfo.pets.Hamster;
import com.chenlm.learn.tjava.typeinfo.pets.Pet;

public class PetMap {
    public static void main(String[] args) {
        Map<String,Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }
}
