package com.example.mhasan.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class UpdatedActivity extends AppCompatActivity  implements View.OnClickListener {
    private EditText firstNum ,secondNum ;
    private RadioButton addRadio ,subRadio, mulRadio,divRadio;
    private Button resButton;
    Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updated);

        init();
    }

    public void init() {
        firstNum = (EditText) findViewById(R.id.firstNum);
        secondNum = (EditText) findViewById(R.id.secondNum);
        double res;
        resButton=(Button)findViewById(R.id.resButton);

        addRadio = (RadioButton) findViewById(R.id.addRadio);
        subRadio = (RadioButton) findViewById(R.id.subRadio);
        mulRadio = (RadioButton) findViewById(R.id.mulRadio);
        divRadio = (RadioButton) findViewById(R.id.divRadio);

        addRadio.setOnClickListener(this);
        subRadio.setOnClickListener(this);
        mulRadio.setOnClickListener(this);
        divRadio.setOnClickListener(this);

        resButton.setOnClickListener(this);

    }

    public void onClick(View view){

//        boolean checked =((RadioButton)view).isChecked();
        switch (view.getId() ){
          /*  case R.id.addRadio:
                if(checked){

                }

                break;
*/
            case R.id.resButton :
                String text=" compute  !";
                toast.makeText( getBaseContext(),text,toast.LENGTH_SHORT).show();
                break;
        }
    }
}
