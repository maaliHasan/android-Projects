package com.example.mhasan.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // interface provide callback  invoked when view is clicked
    private EditText firstNum, secondNum;
    private Button bttnAdd, bttnSub, bttndiv, bttnmul;
    private  Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        firstNum = (EditText) findViewById(R.id.first_number); //explicitly typecasts the returned view by Id into EditText View
        secondNum = (EditText) findViewById(R.id.second_number);
        bttnAdd = (Button) findViewById(R.id.addition_button);
        bttnSub = (Button) findViewById(R.id.subtraction_button);
        bttndiv = (Button) findViewById(R.id.division_button);
        bttnmul = (Button) findViewById(R.id.multiplication_buton);

        bttnAdd.setOnClickListener(this);
        bttnSub.setOnClickListener(this);
        bttndiv.setOnClickListener(this);
        bttnmul.setOnClickListener(this);


    }


    public void onClick(View view) {

        String num1 = firstNum.getText().toString();
        String num2 = secondNum.getText().toString();
        int res;
     /*   res = Integer.parseInt(num1) +Integer.parseInt(num2) ;
        toast.makeText(getBaseContext(), num1, toast.LENGTH_SHORT ).show();
        //CharSequence num1 = firstNum.getText() ;
        //  String s = (num1!= null) ? num1.toString() : "null";
    */
        switch(view.getId()){
            case R.id.addition_button:
              res = Integer.parseInt(num1) +Integer.parseInt(num2) ;
                toast.makeText(getBaseContext(),String.valueOf(res) , toast.LENGTH_SHORT ).show();
                break;

            case R.id.subtraction_button:
                 res= Integer.parseInt(num1) - Integer.parseInt(num2) ;
                  toast.makeText(getBaseContext(),String.valueOf(res)   , toast.LENGTH_SHORT ).show();
                 break;

            case R.id.division_button:
                if (Integer.parseInt(num2)== 0 ){
                    String text="Invalid operation: divide by zero";
                    toast.makeText(getBaseContext(), text  , toast.LENGTH_SHORT ).show();
                    break;
                }
                else {
                    res = Integer.parseInt(num1) / Integer.parseInt(num2);
                    toast.makeText(getBaseContext(), String.valueOf(res), toast.LENGTH_SHORT).show();
                    break;
                }

            case R.id.multiplication_buton:
                res= Integer.parseInt(num1)* Integer.parseInt(num2) ;
                toast.makeText(getBaseContext(),String.valueOf(res)   , toast.LENGTH_SHORT ).show();
                break;


        }



    }
}