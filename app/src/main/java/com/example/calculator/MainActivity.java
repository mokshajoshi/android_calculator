package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    EditText etInput;
    LinearLayout llClear,llPercentage,llRemove,llDivide,llMultiply,llMinus,llPlus,llEqual,llOne,
            llTwo,llThree,llFour,llFive,llSix,llSeven,llEight,llNine,llZero,llDZero,llDot;
    String aText = "";
    String bText = "";
    String oText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInput = findViewById(R.id.etInput);
        llClear = findViewById(R.id.llClear);
        llPercentage = findViewById(R.id.llPercentage);
        llRemove = findViewById(R.id.llRemove);
        llDivide = findViewById(R.id.llDivide);
        llMultiply = findViewById(R.id.llMultiply);
        llMinus = findViewById(R.id.llMinus);
        llPlus = findViewById(R.id.llPlus);
        llEqual = findViewById(R.id.llEqual);
        llOne = findViewById(R.id.llOne);
        llTwo = findViewById(R.id.llTwo);
        llThree = findViewById(R.id.llThree);
        llFour = findViewById(R.id.llFour);
        llFive = findViewById(R.id.llFive);
        llSix = findViewById(R.id.llSix);
        llSeven = findViewById(R.id.llSeven);
        llEight = findViewById(R.id.llEight);
        llNine = findViewById(R.id.llNine);
        llZero = findViewById(R.id.llZero);
        llDZero = findViewById(R.id.llDZero);
        llDot = findViewById(R.id.llDot);

        llClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aText = "";
                oText = "";
                bText = "";
                etInput.setText(aText + oText + bText);
            }
        });

        llPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFunction("%");
            }
        });

        llRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aText = "";
                oText = "";
                bText = "";
                etInput.setText(aText + oText + bText);
            }
        });

        llDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFunction("/");
            }
        });

        llSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("7");
            }
        });

        llEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("8");
            }
        });

        llNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("9");
            }
        });

        llMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFunction("*");
            }
        });

        llFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("4");
            }
        });

        llFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("5");
            }
        });

        llSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("6");
            }
        });

        llMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFunction("-");
            }
        });

        llOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("1");
            }
        });

        llTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("2");
            }
        });

        llThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("3");
            }
        });

        llZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberFunction("0");
            }
        });

        llPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorFunction("+");
            }
        });

        llEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result();
            }
        });
    }

    public void numberFunction(String number){
        if (aText.isEmpty() && !oText.isEmpty()) {
            aText = "";
            oText = "";
            bText = "";
        } else if (aText.isEmpty() && oText.isEmpty()) {
            aText = number;
            oText = "";
            bText = "";
        } else if (bText.isEmpty() && !aText.isEmpty()) {
            aText = aText;
            oText = oText;
            bText = number;
        }
        etInput.setText(aText + oText + bText);
    }

    public void operatorFunction(String operator){
        if (aText.isEmpty() && !oText.isEmpty()) {
            aText = "";
            oText = "";
            bText = "";
        } else if (!aText.isEmpty() && oText.isEmpty()) {
            aText = aText;
            oText = operator;
            bText = "";
        }
        etInput.setText(aText + oText + bText);
    }

    public void result(){
        if(oText == "+"){
            aText = (Integer.parseInt(aText) + (Integer.parseInt(bText))) + "";
            oText = "";
            bText = "";
        } else if (oText == "-") {
            aText = (Integer.parseInt(aText) - (Integer.parseInt(bText))) + "";
            oText = "";
            bText = "";
        } else if (oText == "*") {
            aText = (Integer.parseInt(aText) * (Integer.parseInt(bText))) + "";
            oText = "";
            bText = "";
        } else if (oText == "/") {
            aText = (Integer.parseInt(aText) / (Integer.parseInt(bText))) + "";
            oText = "";
            bText = "";
        } else if (oText == "%") {
            aText = (Integer.parseInt(aText) % (Integer.parseInt(bText))) + "";
            oText = "";
            bText = "";
        }
        etInput.setText(aText + oText + bText);

    }

}