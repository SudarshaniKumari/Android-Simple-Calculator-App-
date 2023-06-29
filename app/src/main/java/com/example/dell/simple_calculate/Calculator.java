package com.example.dell.simple_calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Calculator extends Activity implements View.OnClickListener {

    Button buttonAdd, buttonSub, buttonMul, buttonDiv, buttonclear;
    EditText editTextn1,editTextn2,editTextanswer;
    int num1 , num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        buttonAdd =(Button) findViewById(R.id.btnaddition);
        buttonSub =(Button) findViewById(R.id.btnsubtraction);
        buttonMul =(Button) findViewById(R.id.btnmultiplication);
        buttonDiv =(Button) findViewById(R.id.btndivision);

        editTextn1 =(EditText) findViewById(R.id.editNumber1);
        editTextn2=(EditText) findViewById(R.id.editNumber2);
        editTextanswer=(EditText) findViewById(R.id.editAnswer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonclear.setOnClickListener(this);


            }





 public  int getIntFromEditText(EditText editText){
     if(editText.getText().toString().equals("")){
         Toast.makeText(Calculator.this,"Enter Number",Toast.LENGTH_SHORT).show();
         return 0;
     }else
    return Integer.parseInt(editText.getText().toString());

 }

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextn1);
        num2 = getIntFromEditText(editTextn2);
        switch (view.getId()){
            case R.id.btnaddition:
                editTextanswer.setText(""+(num1+num2) );
                break;
            case R.id.btnsubtraction:
                editTextanswer.setText(""+(num1-num2) );
                break;
            case R.id.btnmultiplication:
                editTextanswer.setText(""+(num1*num2) );
                break;
            case R.id.btndivision:
                editTextanswer.setText(""+((float)num1/(float)num2) );
                break;
        }



    }





}
