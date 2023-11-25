package com.example.myapplication2todelete;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.EditText;


/**
 *
 */
public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button addButton, subtractButton, multiplyButton, divideButton, nullButton, prButton, aButton, rotButton, phButton,vButton;
    TextView result, result2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// deklarera variabler
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        nullButton = findViewById(R.id.nullButton);
        prButton = findViewById(R.id.prButton);
        aButton = findViewById(R.id.aButton);
        rotButton = findViewById(R.id.rotButton);
        phButton = findViewById(R.id.phButton);
        vButton = findViewById(R.id.vButton);
        result = findViewById(R.id.result);
        result2 = findViewById(R.id.result2);

//nollställa värdet
        nullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText("");
                number2.setText("");
                result.setText("Result will be displayed here");
                result.setText("");
                number1.getText().clear();
                number2.getText().clear();
            }
        });
// räkna ut addition
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 + num2;
                    result.setText("Result: " + res);
                    result2.setText(num1 + " + " + num2);
                    number1.getText().clear();
                    number2.getText().clear();
                }
            }
        });
// räkna ut subtraction
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 - num2;
                    result.setText("Result: " + res);
                    result2.setText(num1 + " - " + num2);
                    number1.getText().clear();
                    number2.getText().clear();
                }
            }
        });

// räkna ut multiplikation
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 * num2;
                    result.setText("Result: " + res);
                    result2.setText(num1 + " * " + num2);
                    number1.getText().clear();
                    number2.getText().clear();
                }
            }
        });
// räkna ut division
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = num1 / num2;
                    result.setText("Result: " + res);
                    result2.setText(num1 + " / " + num2);
                    number1.getText().clear();
                    number2.getText().clear();
                }
            }
        });
//räkna ut procent
        prButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res = (num1 * num2) / 100;
                    result.setText(" Result: " + res);
                    result2.setText(num1 + " % " + " * " + num2);
                    number1.getText().clear();
                    number2.getText().clear();
                }
            }
        });
// räkna ut cirkelns area
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!number1.getText().toString().isEmpty() && number2.getText().toString().isEmpty()) {
                    float num = Float.parseFloat(number1.getText().toString());
                    float res = (float) (3.14 * (Math.pow(num, 2)));
                    result.setText(" A = "+ res);
                    result2.setText("A = π " +num+" ²");
                    number1.getText().clear();
                    number2.getText().clear();

                }
                else if (!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                    float num1 = Float.parseFloat(number1.getText().toString());
                    float num2 = Float.parseFloat(number2.getText().toString());
                    float res1 = (float)(3.14 * (Math.pow(num1, 2)));
                    float res2 = (float)(3.14 * (Math.pow(num2, 2)));
                    result.setText("A = π " +num1+" ² = "+ res1);
                    result2.setText("A = π " +num2+" ² = "+ res2);
                    number1.getText().clear();
                    number2.getText().clear();

                } else if (number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                    float num = Float.parseFloat(number2.getText().toString());
                    float res = (float) (3.14 * (Math.pow(num, 2)));
                    result.setText(" A = "+ res);
                    result2.setText("A = π " +num+" ²");
                    number1.getText().clear();
                    number2.getText().clear();

                } else {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();
                    number1.getText().clear();
                    number2.getText().clear();

                }
            }
        });
        //räkna ut roten ur
        rotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number1.getText().toString().isEmpty() && number2.getText().toString().isEmpty()) {
                    double num = Double.parseDouble(number1.getText().toString());
                    double res = Math.sqrt(num);
                    result.setText(" √"+num+" = "+ res);
                    result2.setText("");
                    number1.getText().clear();
                    number2.getText().clear();

                }
                else if (!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    double res1 = Math.sqrt(num1);
                    double res2 = Math.sqrt(num2);
                    result.setText(" √"+num1+" = "+ res1);
                    result2.setText(" √"+num2+" = "+ res2);
                    number1.getText().clear();
                    number2.getText().clear();

                } else if (number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()) {
                    double num = Double.parseDouble(number2.getText().toString());
                    double res = Math.sqrt(num);
                    result.setText(" √"+num+" = "+ res);
                    result2.setText("");
                    number1.getText().clear();
                    number2.getText().clear();

                } else {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();
                    number1.getText().clear();
                    number2.getText().clear();

                }
            }
        });
        // räkna ut pythagoras sats
        phButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    double num1 = Double.parseDouble(number1.getText().toString());
                    double num2 = Double.parseDouble(number2.getText().toString());
                    float res =(float) (Math.pow(num1, 2)+Math.pow(num2, 2)) ;
                    result.setText(" Result: " + res);
                    result2.setText("c² = a²+ b² =" + num1 + "² +" + num2+"²");
                    number1.getText().clear();
                    number2.getText().clear();
                }
            }
        });
        // räkna ut cylinderns volym
        vButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number", Toast.LENGTH_SHORT).show();

                } else {
                    float r = Float.parseFloat(number1.getText().toString());
                    float h = Float.parseFloat(number2.getText().toString());
                    float res = (float) ((3.14 * (Math.pow(r, 2)))*h);
                    result.setText(" V = "+ res);
                    result2.setText("V = πr2 ⋅ h = " +"π⋅ "+r +" ² ⋅"+h);
                    number1.getText().clear();
                    number2.getText().clear();

                }
            }
        });
    }
}








