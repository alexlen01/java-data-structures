package com.local.coding.hashtables;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class HashCodeGeneratorTest 
{
    @Test
    public void shouldAnswerWithTrue() throws NoSuchAlgorithmException, IOException
    {
    	HashCodeGenerator.SomeObject testObject= new HashCodeGenerator.SomeObject();
    	BigInteger expected = new BigInteger("-77668794484143027965284748270155587431");
        assertTrue(expected.equals(HashCodeGenerator.generate(testObject)));
    }

}
