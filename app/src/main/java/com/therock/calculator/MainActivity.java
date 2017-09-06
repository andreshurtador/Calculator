package com.therock.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double res = 0, num1 = 0, num2 = 0,aux=0;
    private TextView tOperacion, tResultado;
    private Integer simbolo = 0;
    private Boolean pos1 = true, pos2 = true, igual = false,punto1=true,punto2=true;
    private String ver_operacion = "";

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
                num1 = Double.parseDouble(tResultado.getText().toString());
                break;
            case 2:
                res = num1 - num2;
                tResultado.setText(res + (""));
                num1 = Double.parseDouble(tResultado.getText().toString());
                break;
            case 3:
                res = num1 * num2;
                tResultado.setText(res + (""));
                num1 = Double.parseDouble(tResultado.getText().toString());
                break;
            case 4:
                if (num2 != 0) {
                    res = num1 / num2;
                    tResultado.setText(res + (""));
                    num1 = Double.parseDouble(tResultado.getText().toString());
                    break;
                } else {
                    tResultado.setText("Error");
                    break;
                }
            default:
                tOperacion.setText("Error, Reinicie");
                break;
        }
    }


    public void BUno(View view) {
        if (pos1 == true && igual == false) {
            num1 = 1;
            ver_operacion = "1";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 1;
                ver_operacion += " 1";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BDos(View view) {
        if (pos1 == true && igual == false) {
            num1 = 2;
            ver_operacion = "2";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 2;
                ver_operacion += " 2";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BTres(View view) {
        if (pos1 == true && igual == false) {
            num1 = 3;
            ver_operacion = "3";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 3;
                ver_operacion += " 3";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }


    public void BCuatro(View view) {
        if (pos1 == true && igual == false) {
            num1 = 4;
            ver_operacion = "4";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 4;
                ver_operacion += " 4";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BCinco(View view) {
        if (pos1 == true && igual == false) {
            num1 = 5;
            ver_operacion = "5";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 5;
                ver_operacion += " 5";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BSeis(View view) {
        if (pos1 == true && igual == false) {
            num1 = 6;
            ver_operacion = "6";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 6;
                ver_operacion += " 6";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BSiete(View view) {
        if (pos1 == true && igual == false) {
            num1 = 7;
            ver_operacion = "7";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 7;
                ver_operacion += " 7";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BOcho(View view) {
        if (pos1 == true && igual == false) {
            num1 = 8;
            ver_operacion = "8";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 8;
                ver_operacion += " 8";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BNueve(View view) {
        if (pos1 == true && igual == false) {
            num1 = 9;
            ver_operacion = "9";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 9;
                ver_operacion += "9";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BCero(View view) {
        if (pos1 == true && igual == false) {
            num1 = 0;
            ver_operacion = "0";
            tOperacion.setText(ver_operacion);
            pos1 = false;
        } else {
            if (pos2 == true && igual == false) {
                num2 = 0;
                ver_operacion += "0";
                tOperacion.setText(ver_operacion);
                pos2 = false;
                igual = true;
            } else {
                tOperacion.setText("Error, Reinicie");
            }
        }
    }

    public void BPunto(View view) {

        if (pos1 == true && pos2 == true && igual == false && punto1 == false && punto2 == false) {
            tOperacion.setText("Error, Reinicie");
        } else {
            if (pos1 == false && pos2 == true && igual == false && punto1 == true && punto2 == true) {
                aux=Double.parseDouble(tOperacion.getText() + ".");
                num1 = aux;
                ver_operacion = Double.toString(num1);
                tOperacion.setText(ver_operacion);
                punto1 = false;
            } else {
                if (pos1 == false && pos2 == false && igual == true && punto1 == false && punto2 == true) {
                    aux = Double.parseDouble(tOperacion.getText() + ".");
                    num2 = aux;
                    ver_operacion += Double.toString(num1);
                    tOperacion.setText(ver_operacion);
                    punto2 = false;
                    } else {
                    tOperacion.setText("Error, Reinicie");
                }
            }


        }
    }

    public void BMas(View view) {

        if (pos1 == false && pos2 == true && igual == false) {
            simbolo = 1;
            ver_operacion += " + ";
            tOperacion.setText(ver_operacion);
        } else {
            tOperacion.setText("Error, Reinicie");
        }

    }

    public void BMenos(View view) {
        if (pos1 == false && pos2 == true && igual == false) {
            simbolo = 2;
            ver_operacion += "-";
            tOperacion.setText(ver_operacion);
        } else {
            tOperacion.setText("Error, Reinicie");
        }
    }


    public void BPor(View view) {
        if (pos1 == false && pos2 == true && igual == false) {
            simbolo = 3;
            ver_operacion += "*";
            tOperacion.setText(ver_operacion);
        } else {
            tOperacion.setText("Error, Reinicie");
        }
    }


    public void BDivision(View view) {
        if (pos1 == false && pos2 == true && igual == false) {
            simbolo = 4;
            ver_operacion += "/";
            tOperacion.setText(ver_operacion);
        } else {
            tOperacion.setText("Error, Reinicie");
        }
    }

    public void BIgual(View view) {

        if (pos1 == false && pos2 == false && igual == true) {
            pos1 = true;
            pos2 = true;
            igual = false;
            Calcular(num1, num2, simbolo);
        } else {
            tOperacion.setText("Error, Reinicie, igual");
        }


    }

    public void BReinicio(View view) {
        pos1 = true;
        pos2 = true;
        igual = false;
        punto1 = true;
        punto2 = true;
        num1 = 0;
        num2 = 0;
        res = 0;
        simbolo = 0;
        tOperacion.setText("");
        tResultado.setText("");
    }
}
