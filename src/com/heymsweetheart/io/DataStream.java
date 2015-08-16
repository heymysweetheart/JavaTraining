package com.heymsweetheart.io;

import java.io.*;

/**
 * Created by leo on 15/8/16.
 */
public class DataStream {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeDouble(Math.random());  //8 bytes
            dataOutputStream.writeBoolean(false);  //1 byte
            dataOutputStream.writeByte(1025); //1 byte, only store the low eight bits.
            dataOutputStream.writeBytes("a");
//            dataOutputStream.writeBytes("helloworld");  //10 bytes Writes out the string to the underlying output stream as a sequence of bytes.
            // Each character in the string is written out, in sequence, by discarding its high eight bits. If no exception is thrown, the counter written is incremented by the length of s.
            dataOutputStream.writeChar(20);  //2 bytes
            dataOutputStream.writeFloat(21.09887f);  //4 bytes
        } catch (IOException e) {
            e.printStackTrace();
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        System.out.println(byteArrayInputStream.available());
        System.out.println(dataInputStream.readDouble());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readByte());
        System.out.println(dataInputStream.readChar());
    }
}
