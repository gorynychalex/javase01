package ru.javalang.module11;

import ru.javalang.module06.tasks.t02.Car;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = ByteBuffer.allocate(5);

        int capacity = buffer.capacity();
        int limit = buffer.limit();
        int position = buffer.position();
        System.out.printf("Capacity: %d, position: %d, limit: %d\n", capacity, position, limit);
        System.out.println("Buffer: " + buffer);

    }
}
