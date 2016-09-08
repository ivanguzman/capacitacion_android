package com.seratic.enterprise.holamundoseratic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Clase1Ejercicio1Activity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private TextView textView;
    private Button button;
    private EditText editText;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase1_ejercicio1);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        button.setOnClickListener(this);
        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == textView) {
            textView.setText(editText.getText());
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String texto = "";
        if (b) {
            switch (compoundButton.getId()) {
                case R.id.checkBox1:
                    texto = checkBox1.getText().toString();
                    break;
                case R.id.checkBox2:
                    texto = checkBox2.getText().toString();
                    break;
                case R.id.checkBox3:
                    texto = checkBox3.getText().toString();
                    break;
            }
            Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
        }
    }
}
