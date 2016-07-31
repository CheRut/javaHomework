package ru.dimcher.part001.testPartOne;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestSubClass{
	 @Test
		public void testContains() throws Exception {
        Sub sub = new Sub();
        assertTrue(sub.contains("ломоть","лом"));
    }
}


