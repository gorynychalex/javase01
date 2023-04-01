package ru.javalang.module17.p08Adapter;

public class Main {
    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUSBCable();
    }
}
