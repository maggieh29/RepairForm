package com.example.repairform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener submitListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getInputs();

            double subtotal = order + technician + inspection + paint + parts + labor;
            subtotalNum.setText("$" + String.format("%.2f",subtotal));


            double tax, total;
            tax = subtotal * 0.07;
            total = subtotal + tax;

            taxNum.setText("$" + String.format("%.2f",tax));
            totalNum.setText("$" + String.format("%.2f",total));
        }
    };


    //Need to create a variable in code that is the same type of widget in the xml
    Button buttSubmit;
    //text view
    TextView subtotalNum;
    TextView totalNum;
    TextView taxNum;
    //edit text
    EditText orderInput;
    EditText techInput;
    EditText inspectionInput;
    EditText paintInput;
    EditText partsInput;
    EditText laborInput;
    double order;
    double technician;
    double inspection;
    double paint;
    double parts;
    double labor;

    @Override
    //the first method to be called by default, like the main in java
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //load the xml activity and initialize it
        setContentView(R.layout.activity_main);

        //assigning the widget created in the xml to a variable in java code
        buttSubmit = findViewById(R.id.buttSubmit);
        subtotalNum = findViewById(R.id.subtotalNum);
        totalNum = findViewById(R.id.totalNum);
        taxNum = findViewById(R.id.taxNum);
        //all text inputs
        orderInput = findViewById(R.id.orderInput);
        techInput = findViewById(R.id.technicianInput);
        inspectionInput = findViewById(R.id.inspectionInput);
        paintInput = findViewById(R.id.paintInput);
        partsInput = findViewById(R.id.partsInput);
        laborInput = findViewById(R.id.laborInput);




        /**now you can manipulate the actions of the variables
        buttSubmit.setText("Hello"); **/
        orderInput.setText("");
        techInput.setText("");
        inspectionInput.setText("");
        paintInput.setText("");
        partsInput.setText("");
        laborInput.setText("");

        //Assign button to listener
        buttSubmit.setOnClickListener(submitListener);



    }
    //takes all text fields and assigns them to their string variables
    public void getInputs(){
        order = Float.valueOf(orderInput.getText().toString());
        technician = Float.valueOf(techInput.getText().toString());
        inspection = Float.valueOf(inspectionInput.getText().toString());
        paint = Float.valueOf(paintInput.getText().toString());
        parts = Float.valueOf(partsInput.getText().toString());
        labor = Float.valueOf(laborInput.getText().toString());
    }

}