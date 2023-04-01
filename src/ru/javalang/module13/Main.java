package ru.javalang.module13;

public class Main {
    public static void main(String[] args) {

        Thread myTalk = new Thread(new MyTalk(5));
        Thread myWalk = new Thread(new MyWalk(7));
        myTalk.start();
        myWalk.start();
    }
}
