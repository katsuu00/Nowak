
public class BMI {

    public double oblicz(double waga, double wzrost) {

        wzrost = wzrost / 100;

        return waga / (wzrost * wzrost);
    }

    public String wynik(double bmi) {

        if (bmi < 18.5) {
            return "Niedowaga - zolty";

        } else if (bmi < 25) {
            return "Prawidlowa waga - zielony";

        } else {
            return "Nadwaga - czerwony";
        }
    }
}
