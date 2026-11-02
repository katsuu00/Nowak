package com.example.anagram;

import java.util.Arrays;
import java.util.Locale;

/**
 * Klasa sprawdzająca, czy dwa słowa są anagramami.
 *
 * @author Imię Nazwisko
 * @version 1.0
 */
public class Anagram {

    /**
     * Sprawdza, czy dwa podane słowa są anagramami.
     *
     * @param slowo1 pierwsze słowo
     * @param slowo2 drugie słowo
     * @return true, jeśli słowa są anagramami, w przeciwnym razie false
     */
    public boolean isAnagram(String slowo1, String slowo2) {

        if (slowo1 == null || slowo2 == null) {
            return false;
        }

        String a = slowo1.replaceAll("\\s+", "")
                .toLowerCase(Locale.ROOT);

        String b = slowo2.replaceAll("\\s+", "")
                .toLowerCase(Locale.ROOT);

        char[] tab1 = a.toCharArray();
        char[] tab2 = b.toCharArray();

        Arrays.sort(tab1);
        Arrays.sort(tab2);

        return Arrays.equals(tab1, tab2);
    }

    /**
     * Zwraca wynik sprawdzania anagramu.
     *
     * @param wynik wartość logiczna sprawdzenia
     * @return TAK lub NIE
     */
    public String printWynik(boolean wynik) {

        if (wynik) {
            return "TAK";
        } else {
            return "NIE";
        }
    }
}
