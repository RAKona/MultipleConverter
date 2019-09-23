package com.bitm.multipleconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText lengthET, weightET,timeET;
    private RadioButton kilometerTometerRB, meterTokilometerRB, kilogramTogramRB, gramTokilogramRB,secondTominuteRB,minuteTosecondRB;
    private Button convertBtnLength, convertBtnweight,convertBtntime;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //Length
        lengthET = findViewById(R.id.lengthET);
        kilometerTometerRB = findViewById(R.id.kmTometerRB);
        meterTokilometerRB = findViewById(R.id.meterTokmRB);
        convertBtnLength = findViewById(R.id.convertBtnLength);

        convertBtnLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value = lengthET.getText().toString();
                if (value.equals("")) {

                    Toast.makeText(MainActivity.this, "Enter The Value", Toast.LENGTH_LONG).show();
                } else {
                    if (meterTokilometerRB.isChecked()) {
                        double totalValue = Double.valueOf(value);
                        double result = totalValue / 1000;
                        lengthET.setText(String.valueOf(result));

                    } else {
                        double totalValue = Double.valueOf(value);
                        double result = totalValue * 1000;
                        lengthET.setText(String.valueOf(result));
                    }


                }
            }
        });

        //Weight

        weightET=findViewById(R.id.weightET);
        kilogramTogramRB=findViewById(R.id.kilogramTogramRB);
        gramTokilogramRB=findViewById(R.id.gramTokilogramRB);
        convertBtnweight=findViewById(R.id.convertBtnweight);

        convertBtnweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value=weightET.getText().toString();
                if(value.equals("")){

                    Toast.makeText(MainActivity.this,"Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    if(kilogramTogramRB.isChecked()){

                        double totalValue=Double.valueOf(value);
                        double result=totalValue*1000;
                        weightET.setText(String.valueOf(result));
                    }

                    else{
                        double totalValue=Double.valueOf(value);
                        double result=totalValue/1000;
                        weightET.setText(String.valueOf(result));
                    }


                }
            }

        });

        //Time

        timeET=findViewById(R.id.timeET);
        secondTominuteRB=findViewById(R.id.secondTominuteRB);
        minuteTosecondRB=findViewById(R.id.minutrTosecondRB);
        convertBtntime=findViewById(R.id.convertBtntime);

        convertBtntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value=timeET.getText().toString();
                if(value.equals("")){

                    Toast.makeText(MainActivity.this,"Enter The Value",Toast.LENGTH_LONG).show();
                }

                else {
                    if (secondTominuteRB.isChecked()){

                        double totalValue=Double.valueOf(value);
                        double result=totalValue/60;
                        timeET.setText(String.valueOf(result));
                    }

                    else {

                        double totalValue=Double.valueOf(value);
                        double result=totalValue*60;
                        timeET.setText(String.valueOf(result));

                    }
                }

            }
        });

    }
}
