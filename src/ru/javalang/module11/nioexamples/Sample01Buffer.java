package ru.javalang.module11.nioexamples;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Sample01Buffer {
    public static void main(String[] args) {

        Buffer buffer = ByteBuffer.allocate(5);

        int capacity = buffer.capacity();
        int limit = buffer.limit();
        int position = buffer.position();
        System.out.printf("Capacity: %d, position: %d, limit: %d\n", capacity, position, limit);
        System.out.println("Buffer: " + buffer);
    }
}
