package dev.datastructures.hashtables;

import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

public class HashCodeGeneratorTest {

    @Test
    public void shouldAnswerWithTrue() throws NoSuchAlgorithmException, IOException, IllegalAccessException {
        SomeObject testObject = new SomeObject();
        BigInteger expected = new BigInteger("-86061684411938970798768875194932056110");

        assertEquals(expected, HashCodeGenerator.generate(testObject));
    }

    static class SomeObject {
        private int count = 200;
        private long product = 1235134123l;
        private double stdDev = 12343521.456d;
        private String name = "Test Name";
        private char delimiter = '\n';
    }
}
