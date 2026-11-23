
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Klasa testujaca metody klasy BMI.
 */
public class BMITest {

    /**
     * Testuje obliczanie BMI dla wagi 70 kg i wzrostu 179 cm.
     */
    @Test
    public void testOblicz1() {

        BMI bmi = new BMI();

        double wynik = bmi.oblicz(70, 179);

        assertEquals(21.85, wynik, 0.01);
    }

    /**
     * Testuje obliczanie BMI dla wagi 60 kg i wzrostu 180 cm.
     */
    @Test
    public void testOblicz2() {

        BMI bmi = new BMI();

        double wynik = bmi.oblicz(60, 180);

        assertEquals(18.52, wynik, 0.01);
    }

    /**
     * Testuje obliczanie BMI dla wagi 90 kg i wzrostu 180 cm.
     */
    @Test
    public void testOblicz3() {

        BMI bmi = new BMI();

        double wynik = bmi.oblicz(90, 180);

        assertEquals(27.78, wynik, 0.01);
    }

    /**
     * Testuje komunikat dla niedowagi.
     */
    @Test
    public void testWynik1() {

        BMI bmi = new BMI();

        assertEquals("Niedowaga", bmi.wynik(18));
    }

    /**
     * Testuje komunikat dla prawidlowej wagi.
     */
    @Test
    public void testWynik2() {

        BMI bmi = new BMI();

        assertEquals("Prawidlowa waga", bmi.wynik(18.5));
    }

    /**
     * Testuje komunikat dla prawidlowej wagi przy BMI 24.99.
     */
    @Test
    public void testWynik3() {

        BMI bmi = new BMI();

        assertEquals("Prawidlowa waga", bmi.wynik(24.99));
    }

    /**
     * Testuje komunikat dla nadwagi.
     */
    @Test
    public void testWynik4() {

        BMI bmi = new BMI();

        assertEquals("Nadwaga", bmi.wynik(25));
    }
}
