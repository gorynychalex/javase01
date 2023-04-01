package ru.javalang.module11.nioexamples;

import java.nio.ByteBuffer;

public class Sample04Clear {
    public static void main(String[] args) {
        byte arr[] = {10, 20, 30, 40, 50};
        ByteBuffer buffer = ByteBuffer.wrap(arr);
        System.out.println("Initial buffer state: " + buffer);
        System.out.println("First read from buffer: " + buffer.get());
        System.out.println("Buffer state: " + buffer);
        System.out.println("Second read from buffer: " + buffer.get());
        System.out.println("Buffer state: " + buffer);
        System.out.println("Buffed read from buffer: " + buffer.get());
        System.out.println("Buffer state: " + buffer);
        buffer.flip();
        System.out.println("Buffer after flip: " + buffer);
        buffer.clear();
        System.out.println("Buffer after clear: " + buffer);
    }
}
