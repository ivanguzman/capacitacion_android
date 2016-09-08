package com.seratic.enterprise.holamundoseratic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class Clase1Taller1Activity extends AppCompatActivity implements CompoundButton.OnClickListener {

    private CheckBox amarillo;
    private CheckBox azul;
    private CheckBox rojo;
    private RadioButton amarillo1;
    private RadioButton azul1;
    private RadioButton rojo1;
    private View cuadro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase1_taller1);
        amarillo = (CheckBox) findViewById(R.id.amarillo);
        azul = (CheckBox) findViewById(R.id.azul);
        rojo = (CheckBox) findViewById(R.id.rojo);
        amarillo1 = (RadioButton) findViewById(R.id.amarillo1);
        azul1 = (RadioButton) findViewById(R.id.azul1);
        rojo1 = (RadioButton) findViewById(R.id.rojo1);
        cuadro = findViewById(R.id.cuadro);
        amarillo.setOnClickListener(this);
        azul.setOnClickListener(this);
        rojo.setOnClickListener(this);
        amarillo1.setOnClickListener(this);
        azul1.setOnClickListener(this);
        rojo1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int color = 0XFF000000;
        if (((Checkable) view).isChecked()) {
            switch (view.getId()) {
                case R.id.amarillo:
                case R.id.azul:
                case R.id.rojo:
                    amarillo1.setChecked(false);
                    azul1.setChecked(false);
                    rojo1.setChecked(false);
                    break;
                case R.id.amarillo1:
                case R.id.azul1:
                case R.id.rojo1:
                    amarillo.setChecked(false);
                    azul.setChecked(false);
                    rojo.setChecked(false);
                    break;
            }
        }
        if (amarillo.isChecked() || azul.isChecked() || rojo.isChecked()) {
            if (amarillo.isChecked() && azul.isChecked() && rojo.isChecked()) {
                color = 0xFFFFFFFF;
            } else if (amarillo.isChecked() && azul.isChecked()) {
                color = 0xFF00FF00;
            } else if (amarillo.isChecked() && rojo.isChecked()) {
                color = 0xFFFF8000;
            } else if (azul.isChecked() && rojo.isChecked()) {
                color = 0xFFFF00FF;
            } else if (amarillo.isChecked()) {
                color = 0XFFFFFF00;
            } else if (azul.isChecked()) {
                color = 0xFF0000FF;
            } else {
                color = 0xFFFF0000;
            }
        } else if (amarillo1.isChecked() || azul1.isChecked() || rojo1.isChecked()) {
            if (amarillo1.isChecked()) {
                color = 0XFFFFFF00;
            } else if (azul1.isChecked()) {
                color = 0xFF0000FF;
            } else {
                color = 0xFFFF0000;
            }
        }
        cuadro.setBackgroundColor(color);
    }
}
