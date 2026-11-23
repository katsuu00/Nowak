
public class BMI {

    public double oblicz(double waga, double wzrost) {

        wzrost = wzrost / 100;

        return waga / (wzrost * wzrost);
    }

    public String wynik(double bmi) {

        if (bmi < 18.5) {
            return "Niedowaga";

        } else if (bmi < 25) {
            return "Prawidlowa waga";

        } else {
            return "Nadwaga";
        }
    }
}
