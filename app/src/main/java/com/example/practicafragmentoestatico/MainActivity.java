package com.example.practicafragmentoestatico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButtonSi, radioButtonNo;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enlazarVista();
        respuesta();
    }

    private void enlazarVista() {
        radioButtonSi = findViewById(R.id.radioButtonSi);
        radioButtonNo = findViewById(R.id.radioButtonNo);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    private void respuesta() {
        radioButtonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResultado.setText("Sí");
            }
        });

        radioButtonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewResultado.setText("No");
            }
        });
    }
}