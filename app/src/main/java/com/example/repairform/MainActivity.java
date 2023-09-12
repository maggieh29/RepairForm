package com.example.repairform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttSubmit;
    EditText inputName;
    String nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning the widget created in the xml to a variable in java code
        buttSubmit = findViewById(R.id.buttSubmit);
        inputName = findViewById(R.id.inputName);

        
        nameInput = inputName.getText().toString();



    }
}