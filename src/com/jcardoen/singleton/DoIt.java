package com.jcardoen.singleton;


public class DoIt {
    public static void createStuff() {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        System.out.println("Hashcode " + firstSingleton.hashCode());
        System.out.println("Hashcode " + secondSingleton.hashCode());
    }
}
