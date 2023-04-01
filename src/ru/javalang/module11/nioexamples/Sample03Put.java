package ru.javalang.module11.nioexamples;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class Sample03Put {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(5);

        System.out.println("Buffer state: " + buffer + ", content: " +
                Arrays.toString(buffer.array()));
        byte item = 10;
        System.out.println("Put: " + item);
        buffer.put(item);

        System.out.println("Buffer state: " + buffer + ", content: " +
                Arrays.toString(buffer.array()));
        item = 20;
        System.out.println("Put: " + item);
        buffer.put(item);

        System.out.println("Buffer state: " + buffer + ", content: " +
                Arrays.toString(buffer.array()));
        int intItem = 1000;
        System.out.println("Put: " + intItem);
        buffer.putInt(intItem);
    }
}
