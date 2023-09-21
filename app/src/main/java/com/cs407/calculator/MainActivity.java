package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void goToActivity(int sol) {
        Intent intent = new Intent(this, solution.class);
        intent.putExtra("solution", String.valueOf(sol));
        startActivity(intent);
    }
    public void operation(View view){
        int buttonId = view.getId();

        EditText firstNumber = (EditText) findViewById(R.id.firstNum);
        EditText secondNumber = (EditText) findViewById(R.id.secondNum);

        try {
            int num1 = Integer.parseInt(firstNumber.getText().toString());
            int num2 = Integer.parseInt(secondNumber.getText().toString());

            if (buttonId==R.id.button1) {
                goToActivity(num1 + num2);
            } else if (buttonId==R.id.button2) {
                goToActivity(num1 - num2);
            } else if (buttonId==R.id.button3) {
                goToActivity(num1 * num2);
            } else if (buttonId==R.id.button4) {
                if (num2 == 0) {
                    Toast.makeText(MainActivity.this, "Cannot divide by 0.", Toast.LENGTH_LONG).show();
                } else {
                    goToActivity(num1 / num2);
                }
            }

        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Please enter a valid number.", Toast.LENGTH_LONG).show();
            Log.i("ERROR", "Not a number");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}