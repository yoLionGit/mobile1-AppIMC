package com.pucpr.mobile1_appimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularIMC(View view) {

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double imc = peso/(altura*altura);

        /*IMC = PESO/ALTURAxALTURA */

        if(imc >= 18.5 && imc <= 24.99) {

            textResultado.setText("Peso normal, IMC = "+imc);

        }else if(imc >= 25 && imc <= 29.99) {

            textResultado.setText("Acima do peso, IMC = "+imc);

        }else if(imc >= 30 && imc <= 34.99) {

            textResultado.setText("Opa seu IMC esta alto I, IMC = " +imc);

        }else if(imc >= 35 && imc <= 39.99) {

            textResultado.setText("Opa seu IMC esta alto II, IMC = " +imc);

        }else if(imc >= 40) {

            textResultado.setText("Opa seu IMC esta alto III, IMC = " +imc);

        }





    }
}