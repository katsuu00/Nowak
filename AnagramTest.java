package com.example.anagram;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    // TESTY isAnagram()

    @Test
    public void testAnagramTrue() {
        assertTrue(anagram.isAnagram("kot", "tok"));
    }

    @Test
    public void testAnagramFalse() {
        assertFalse(anagram.isAnagram("kot", "pies"));
    }

    // TESTY printWynik()

    @Test
    public void testPrintWynikTak() {
        assertEquals("TAK", anagram.printWynik(true));
    }

    @Test
    public void testPrintWynikNie() {
        assertEquals("NIE", anagram.printWynik(false));
    }
}
