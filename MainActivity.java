package com.example.anagram;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;

public class MainActivity extends Activity {

    EditText slowo1, slowo2;
    Button sprawdz;

    Anagram anagram = new Anagram();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slowo1 = findViewById(R.id.slowo1);
        slowo2 = findViewById(R.id.slowo2);
        sprawdz = findViewById(R.id.sprawdz);

        sprawdz.setOnClickListener(v -> {

            String a = slowo1.getText().toString();
            String b = slowo2.getText().toString();

            if (a.trim().isEmpty() || b.trim().isEmpty()) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage("Wpisz oba słowa!")
                        .setPositiveButton("OK", null)
                        .show();
                return;
            }

            boolean wynik = anagram.isAnagram(a, b);

            String komunikat;

            if (anagram.printWynik(wynik).equals("TAK")) {
                komunikat = "Podane wyrazy tworzą anagramy";
            } else {
                komunikat = "Podane wyrazy nie są anagramami";
            }

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Wynik")
                    .setMessage(komunikat)
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}
