package com.example.shahwar.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }
    public void onButtonTwo(View v){
        double height =0;
        double weight=0;
        double bmi=0;
        String msg="";


        EditText et1 = (EditText)findViewById(R.id.weighttxt);
        EditText et2 = (EditText)findViewById(R.id.heighttxt);
        Button btn2 = (Button)findViewById(R.id.btn2);
        TextView tv1 = (TextView)findViewById(R.id.resulttxt);
        TextView tv2 = (TextView)findViewById(R.id.bmitxt);

        weight=Double.parseDouble(et1.getText().toString());
        height=Double.parseDouble(et2.getText().toString());

        bmi=height * height;
        bmi=weight/bmi;

        tv2.setText(String.valueOf(bmi));
        if (bmi<18.5){
            msg="Underweight";
        }else if (bmi>18.5 && bmi<32 ){
            msg="Normal";

        }else if (bmi>32){
            msg="Overweight";
        }
        tv1.setText(msg);
    }
    public void onBmiChart(View v){
        Intent i = new Intent(this,Activity3.class);
        startActivity(i);
    }


}
