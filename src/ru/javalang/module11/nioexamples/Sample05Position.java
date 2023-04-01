package ru.javalang.module11.nioexamples;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Sample05Position {
    public static void main(String[] args) {
        Buffer buffer = ByteBuffer.allocate(5);
        ((ByteBuffer) buffer).put(new byte[] {1, 2, 3});
        System.out.println("Buffer state after buffer.put(new byte[]{1,2,3}): \n" + buffer);

//        int oldPosition = buffer.position();
//        buffer.position(0)
//                .limit(oldPosition);
//        System.out.println("New state: " + buffer);
        buffer.flip();
        System.out.println("New state after flip(): " + buffer);

    }
}
