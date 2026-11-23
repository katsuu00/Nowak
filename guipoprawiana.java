
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    JTextField poleWaga;
    JTextField poleWzrost;
    JLabel wynik;

    public GUI() {

        setTitle("Aplikacja BMI");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 1, 10, 10));

        JPanel panelWaga = new JPanel(new GridLayout(2, 1));
        JLabel etykietaWaga = new JLabel("Waga (kg):");
        poleWaga = new JTextField();

        panelWaga.add(etykietaWaga);
        panelWaga.add(poleWaga);

        JPanel panelWzrost = new JPanel(new GridLayout(2, 1));
        JLabel etykietaWzrost = new JLabel("Wzrost (cm):");
        poleWzrost = new JTextField();

        panelWzrost.add(etykietaWzrost);
        panelWzrost.add(poleWzrost);

        JPanel panelDol = new JPanel(new GridLayout(2, 1));
        JButton przycisk = new JButton("OBLICZ");
        wynik = new JLabel("Wynik:");
        wynik.setHorizontalAlignment(SwingConstants.CENTER);

        panelDol.add(przycisk);
        panelDol.add(wynik);

        add(panelWaga);
        add(panelWzrost);
        add(panelDol);

        przycisk.addActionListener(e -> {

            try {

                double waga = Double.parseDouble(
                    poleWaga.getText().replace(",", ".")
                );

                double wzrost = Double.parseDouble(
                    poleWzrost.getText().replace(",", ".")
                );

                if (waga <= 0 || wzrost <= 0) {
                    wynik.setText("Podaj poprawne wartości!");
                    wynik.setForeground(Color.RED);
                    return;
                }

                BMI obliczenia = new BMI();

                double bmi = obliczenia.oblicz(waga, wzrost);
                String komunikat = obliczenia.wynik(bmi);

                wynik.setText(String.format(
                    "BMI: %.2f - %s", bmi, komunikat
                ));

                if (bmi < 18.5) {
                    wynik.setForeground(Color.YELLOW.darker());
                } else if (bmi < 25) {
                    wynik.setForeground(Color.GREEN.darker());
                } else {
                    wynik.setForeground(Color.RED);
                }

            } catch (NumberFormatException ex) {
                wynik.setText("Wpisz poprawne dane!");
                wynik.setForeground(Color.RED);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
