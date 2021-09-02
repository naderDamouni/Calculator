package com.example.mvvm.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvvm.R;

public class MainActivity extends AppCompatActivity {

    boolean newOperator = true;
    boolean allowDecimal = true;
    boolean allowNegative;
    String operator = "+";
    String oldNumber = "";

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.tv_display);


        Log.d("Activity Lifecycle", "onCreate invoked");
        Toast.makeText(MainActivity.this, "onCreate Invoked", Toast.LENGTH_SHORT).show();
    }

    public void numberEvent(View view) {
        if (newOperator) {
            editText.setText("");
            allowNegative = true;
            allowDecimal = true;
        }

        newOperator = false;
        String number = editText.getText().toString();
        int id = view.getId();

        if (id == R.id.zero_btn) {
            number += "0";
        } else if (id == R.id.clear_btn) {
            number = "";
        } else if (id == R.id.one_btn) {
            number += "1";
        } else if (id == R.id.two_btn) {
            number += "2";
        } else if (id == R.id.three_btn) {
            number += "3";
        } else if (id == R.id.four_btn) {
            number += "4";
        } else if (id == R.id.five_btn) {
            number += "5";
        } else if (id == R.id.six_btn) {
            number += "6";
        } else if (id == R.id.seven_btn) {
            number += "7";
        } else if (id == R.id.eight_btn) {
            number += "8";
        } else if (id == R.id.nine_btn) {
            number += "9";
        } else if (allowDecimal && id == R.id.decimal_btn) {
            number += ".";
            allowDecimal = false;
        } else if (allowNegative && id == R.id.positive_negative_btn) {
            number = "-" + number;
            allowNegative = false;
        }
        editText.setText(number);
    }

    public void operatorEvent(View view) {
        newOperator = true;
        oldNumber = editText.getText().toString();
        int id = view.getId();

        if (id == R.id.plus_btn) {
            operator = "+";
        } else if (id == R.id.minus_btn) {
            operator = "-";
        } else if (id == R.id.multiply_btn) {
            operator = "*";
        } else if (id == R.id.divide_btn) {
            operator = "/";
        }
    }

    @SuppressLint("SetTextI18n")
    public void equalEvent(View view) {
        String newNumber = editText.getText().toString();
        double result = 0;
        switch (operator) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        editText.setText(result + "");
    }

    @SuppressLint("SetTextI18n")
    public void moduloEvent(View view) {
        double number = Double.parseDouble(editText.getText().toString()) / 100;
        editText.setText(number + "");
        newOperator = true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Lifecycle", "onStart Invoked");
        Toast.makeText(MainActivity.this, "onStart Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Lifecycle", "onResume Invoked");
        Toast.makeText(MainActivity.this, "onResume Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle", "onPause Invoked");
        Toast.makeText(MainActivity.this, "onPause Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Lifecycle", "onStop Invoked");
        Toast.makeText(MainActivity.this, "onStop Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Lifecycle", "onRestart Invoked");
        Toast.makeText(MainActivity.this, "onRestart Invoked", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Lifecycle", "onDestroy Invoked");
        Toast.makeText(MainActivity.this, "onDestroy Invoked", Toast.LENGTH_SHORT).show();
    }
}
