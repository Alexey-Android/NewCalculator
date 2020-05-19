package com.example.newcalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button button_div, button_c, button_eq, button_min, button_pl, button_mul, button_per, button_sign;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button0 = findViewById(R.id.btn0);
        button = findViewById(R.id.btn);
        res = findViewById(R.id.result);
        button_div = findViewById(R.id.btn_divide);
        button_c = findViewById(R.id.btn_c);
        button_eq = findViewById(R.id.btn_equally);
        button_min = findViewById(R.id.btn_minus);
        button_pl = findViewById(R.id.btn_plus);
        button_mul = findViewById(R.id.btn_multiply);
        button_per = findViewById(R.id.btn_percent);
        button_sign = findViewById(R.id.btn_sign);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button0.getText().toString());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button2.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button3.getText().toString());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button4.getText().toString());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button5.getText().toString());
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button.getText().toString());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button6.getText().toString());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button7.getText().toString());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button8.getText().toString());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button9.getText().toString());
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_c.getText().toString());
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_div.getText().toString());
            }
        });
        button_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_eq.getText().toString());
            }
        });
        button_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_min.getText().toString());
            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_mul.getText().toString());
            }
        });
        button_per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_per.getText().toString());
            }
        });
        button_pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_pl.getText().toString());
            }
        });
        button_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(button_sign.getText().toString());
            }
        });

    }
}
