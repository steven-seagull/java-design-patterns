package com.jcardoen.singleton;

public class Singleton {
    private static Singleton _instance;

    private Singleton() {}

    static Singleton getInstance() {
        if(_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}
