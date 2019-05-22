package com.example.kholodnytska3;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText input;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.inputTxt);
        button = findViewById(R.id.loginBtn);
    }
    public void login (View view){
        name = input.getText().toString();
        Intent intent = new Intent(this, Quest.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }
}
