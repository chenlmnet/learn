package com.chenlm.learn.tjava.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
        "com.chenlm.learn.tjava.typeinfo.pets.Mutt",
        "com.chenlm.learn.tjava.typeinfo.pets.Pug",
        "com.chenlm.learn.tjava.typeinfo.pets.EgyptianMau",
        "com.chenlm.learn.tjava.typeinfo.pets.Manx",
        "com.chenlm.learn.tjava.typeinfo.pets.Cymric",
        "com.chenlm.learn.tjava.typeinfo.pets.Rat",
        "com.chenlm.learn.tjava.typeinfo.pets.Mouse",
        "com.chenlm.learn.tjava.typeinfo.pets.Hamster"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>)Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    public List<Class<? extends Pet>> types() {
        return types;
    }

}
