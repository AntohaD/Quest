package com.dzherdzh.anton.quest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int enterNumber;
    Button btOne, btTwo, btThree, btFour, btFive;
    Button btSix, btSeven, btEight, btNine, btZero;
    Button btClear, btResult;
    TextView tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOne = (Button) findViewById(R.id.button1);
        btTwo = (Button) findViewById(R.id.button2);
        btThree = (Button) findViewById(R.id.button3);
        btFour = (Button) findViewById(R.id.button4);
        btFive = (Button) findViewById(R.id.button5);
        btSix = (Button) findViewById(R.id.button6);
        btSeven = (Button) findViewById(R.id.button7);
        btEight = (Button) findViewById(R.id.button8);
        btNine = (Button) findViewById(R.id.button9);
        btZero = (Button) findViewById(R.id.button0);
        btClear = (Button) findViewById(R.id.btClear);
        btResult = (Button) findViewById(R.id.btResult);
        tvPassword = (TextView) findViewById(R.id.password);

        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btEight.setOnClickListener(this);
        btNine.setOnClickListener(this);
        btClear.setOnClickListener(this);
        btResult.setOnClickListener(this);
        btZero.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.button1:
                ClickNumber(1);
                break;

            case R.id.button2:
                ClickNumber(2);
                break;

            case R.id.button3:
                ClickNumber(3);
                break;

            case R.id.button4:
                ClickNumber(4);
                break;

            case R.id.button5:
                ClickNumber(5);
                break;

            case R.id.button6:
                ClickNumber(6);
                break;

            case R.id.button7:
                ClickNumber(7);
                break;

            case R.id.button8:
                ClickNumber(8);
                break;

            case R.id.button9:
                ClickNumber(9);
                break;

            case R.id.button0:
                ClickNumber(0);
                break;

            case R.id.btClear:

                enterNumber = 0;
                tvPassword.setText(Integer.toString(enterNumber));
                break;

            case R.id.btResult:

                if (tvPassword.getText().toString().equals("301087")) {
                    Intent intent = new Intent(MainActivity.this, Media.class);
                    startActivity(intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(),"password is not correct", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;
        }
    }

    private void ClickNumber(int num){

        enterNumber = enterNumber *10 + num;
        tvPassword.setText(Integer.toString(enterNumber));

    }
}
