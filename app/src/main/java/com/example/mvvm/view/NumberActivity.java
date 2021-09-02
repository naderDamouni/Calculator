//package com.example.mvvm.view;
//
//import android.view.View;
//import android.widget.EditText;
//
//import com.example.mvvm.R;
//
//class NumberActivity {
//    boolean newOperator = true;
//    EditText editText;
//
//    public void numberEvent(View view) {
//        if (newOperator) {
//            editText.setText("");
//        }
//
//        newOperator = false;
//        String number = editText.getText().toString();
//        int id = view.getId();
//
//        if (id == R.id.zero_btn) {
//            number += "0";
//        } else if (id == R.id.clear_btn) {
//            number = "";
//        } else if (id == R.id.one_btn) {
//            number += "1";
//        } else if (id == R.id.two_btn) {
//            number += "2";
//        } else if (id == R.id.three_btn) {
//            number += "3";
//        } else if (id == R.id.four_btn) {
//            number += "4";
//        } else if (id == R.id.five_btn) {
//            number += "5";
//        } else if (id == R.id.six_btn) {
//            number += "6";
//        } else if (id == R.id.seven_btn) {
//            number += "7";
//        } else if (id == R.id.eight_btn) {
//            number += "8";
//        } else if (id == R.id.nine_btn) {
//            number += "9";
//        } else if (id == R.id.decimal_btn) {
//            number += ".";
//        } else if (id == R.id.positive_negative_btn) {
//            number = "-" + number;
//        }
//        editText.setText(number);
//    }
//}
