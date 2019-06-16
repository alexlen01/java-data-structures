package dev.datastructures.hashtables;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashCodeGenerator {

    public static BigInteger generate(final Object someObject) throws NoSuchAlgorithmException, IllegalAccessException, IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        Field[] fields = someObject.getClass().getDeclaredFields();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            for (Field field : fields) {

                field.setAccessible(true);

                //primitive int
                if (field.getType().equals(int.class)) {
                    int i = field.getInt(someObject);
                    dos.writeInt(i);
                }

                //primitive long
                if (field.getType().equals(long.class)) {
                    long l = field.getLong(someObject);
                    dos.writeLong(l);
                }

                //primitive double
                if (field.getType().equals(long.class)) {
                    double d = field.getDouble(someObject);
                    dos.writeDouble(d);
                }

                //primitive char
                if (field.getType().equals(char.class)) {
                    char c = field.getChar(someObject);
                    dos.writeChar(c);
                }

                //String
                if (field.getType().equals(String.class)) {
                    String s = (String) field.get(someObject);
                    dos.writeUTF(s);
                }
            }

            dos.flush();

            byte[] hashBytes = md.digest(baos.toByteArray());
            BigInteger testObjectHash = new BigInteger(hashBytes);

            return testObjectHash;
        } finally {
            dos.close();
        }
    }
}
