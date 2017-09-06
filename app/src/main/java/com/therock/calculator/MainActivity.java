package com.therock.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double res = 0, num1 = 0, num2 = 0;
    private TextView tOperacion, tResultado;
    private Integer simbolo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tOperacion = (TextView) findViewById(R.id.tOperacion);
        tResultado = (TextView) findViewById(R.id.tResultado);
    }

    private void Calcular(double num1, double num2, int simbolo) {
        //1 para + //2 para - //3 para * //4 para /
        switch (simbolo) {
            case 1:
                res = num1 + num2;
                tResultado.setText(res + (""));
                break;
            case 2:
                res = num1 - num2;
                tResultado.setText(res + (""));
                break;
            case 3:
                res = num1 * num2;
                tResultado.setText(res + (""));
                break;
            case 4:
                if (num2 != 0) {
                    res = num1 / num2;
                    tResultado.setText(res + (""));
                    break;
                } else {
                    tResultado.setText("Error");
                    break;
                }
            default:
                tOperacion.setText("Error, Reinicie" );

                break;
        }
    }


    public void BUno(View view) {
             tOperacion.setText(tOperacion.getText().toString() + "1");
    }

    public void BDos(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "2");
    }

    public void BTres(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "3");
    }


    public void BCuatro(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "4");
    }

    public void BCinco(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "5");
    }

    public void BSeis(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "6");
    }

    public void BSiete(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "7");
    }

    public void BOcho(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "8");
    }

    public void BNueve(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "9");
    }

    public void BCero(View view) {
            tOperacion.setText(tOperacion.getText().toString() + "0");
    }

    public void BPunto(View view) {
             tOperacion.setText(tOperacion.getText().toString() + ".");
    }

    public void BMas(View view) {
        simbolo = 1;
        num1 = Double.parseDouble(tOperacion.getText().toString());
        tOperacion.setText("");
    }


    public void BMenos(View view) {
        simbolo = 2;
        num1 = Double.parseDouble(tOperacion.getText().toString());
        tOperacion.setText("");
    }


    public void BPor(View view) {
        simbolo = 3;
        num1 = Double.parseDouble(tOperacion.getText().toString());
        tOperacion.setText("");
    }


    public void BDivision(View view) {
        simbolo = 4;
        num1 = Double.parseDouble(tOperacion.getText().toString());
        tOperacion.setText("");
    }

    public void BIgual(View view) {
        num2 = Double.parseDouble(tOperacion.getText().toString());
        tOperacion.setText("");
        Calcular(num1, num2, simbolo);
    }

    public void BReinicio(View view) {
        num1 = 0;
        num2 = 0;
        res = 0;
        simbolo = 0;
        tOperacion.setText("");
        tResultado.setText("");
    }
}
