package ru.javalang.module17.p01Singletone;

public class Singleton {
    private static Singleton instance;

    public String connectionDB(){
        return "connection";
    };
    private Singleton () {};

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}