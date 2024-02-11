package com.galipugur.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.number1);
        n2 = findViewById(R.id.number2);
        result = findViewById(R.id.result);

    }

    public String get_edittext(EditText number) {
        return number.getText().toString();
    }

    public Integer string_to_number(String number) {
        return Integer.parseInt(number);
    }

    public Integer get_number(EditText num) {
        return string_to_number(get_edittext(num));
    }

    public void make_control(EditText value1, EditText value2, String islem) {
        if (get_edittext(value1).matches("") || get_edittext(value2).matches("")) {
            result.setText("Enter Number Please");
        } else {
            if (islem == "topla") {
                int sonuc = get_number(value1) + get_number(value2);
                result.setText("RESULT: " + sonuc);
            } else if (islem == "cikar") {
                int sonuc = get_number(value1) - get_number(value2);
                result.setText("RESULT: " + sonuc);
            } else if (islem == "carp") {
                int sonuc = get_number(value1) * get_number(value2);
                result.setText("RESULT: " + sonuc);
            } else if (islem == "bol") {
                int sonuc = get_number(value1) / get_number(value2);
                result.setText("RESULT: " + sonuc);
            }
        }

    }

    public void sum(View view) {

        make_control(n1, n2, "topla");

        /*
        if (get_edittext(n1).matches("") || get_edittext(n2).matches("")) {
            result.setText("Enter Number Please");
        } else {


            int first_number = string_to_number(get_edittext(n1));
            int second_number = string_to_number(get_edittext(n2));



            int first_number = Integer.parseInt(n1.getText().toString());
            int second_number = Integer.parseInt(n2.getText().toString());


            int sonuc = get_number(n1) + get_number(n2);
            result.setText("RESULT: " + sonuc);
         }
       */
    }

    public void dublicate(View view) {

        make_control(n1, n2, "cikar");

        /*
        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {
            result.setText("Enter Number Please");
        } else {
            int first_number = Integer.parseInt(n1.getText().toString());
            int second_number = Integer.parseInt(n2.getText().toString());

            int sonuc = first_number - second_number;
            result.setText("RESULT: " + sonuc);
        }
         */
    }

    public void multiply(View view) {

        make_control(n1, n2, "carp");

        /*
        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {
            result.setText("Enter Number Please");
        } else {
            int first_number = Integer.parseInt(n1.getText().toString());
            int second_number = Integer.parseInt(n2.getText().toString());

            int sonuc = first_number * second_number;
            result.setText("RESULT: " + sonuc);
        }
         */
    }

    public void divide(View view) {

        make_control(n1, n2, "bol");

        /*
        if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {
            result.setText("Enter Number Please");
        } else {
            int first_number = Integer.parseInt(n1.getText().toString());
            int second_number = Integer.parseInt(n2.getText().toString());

            int sonuc = first_number / second_number;
            result.setText("RESULT: " + sonuc);
        }
         */
    }

}