package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void goToActivity(String s) {
        Intent intent = new Intent(this, solution.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    public void addFunction(View view){
        EditText myTextField = (EditText) findViewById(R.id.firstNum);

        goToActivity(myTextField.getText().toString());
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        //Log.i("INFO", "Button Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}