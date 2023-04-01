package ru.javalang.module17.p01Singletone;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.connectionDB();

    }
}
