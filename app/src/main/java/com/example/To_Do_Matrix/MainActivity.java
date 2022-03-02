package com.example.To_Do_Matrix;

import android.app.Activity;
import android.os.Bundle;

import androidx.navigation.ui.AppBarConfiguration;

import android.view.View;
import android.widget.TextView;

import com.example.To_Do_Matrix.databinding.ActivityMainBinding;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity<ActivityMainBinding> extends Activity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
private String num = null;
    String incomNumber = "0";
    double firstNumber = 0;
    double lastNumber = 0;

    @BindView(R.id.textViewHistory) TextView textViewHistory;
    @BindView(R.id.textViewResult) TextView textViewResult;


    @OnClick({R.id.Btn0, R.id.Btn1, R.id.Btn2, R.id.Btn3, R.id.Btn4, R.id.Btn5, R.id.Btn6, R.id.Btn7, R.id.Btn8,
            R.id.Btn9, R.id.BtnAC, R.id.Del, R.id.BtnEqual, R.id.BtnMinus, R.id.BtnPlus, R.id.BtnMulty, R.id.BtnDivide,
            R.id.BtnDot})

    public void onViewClicked(View view){
        switch (view.getId()){
            case R.id.Btn0: numClick("0"); break;
            case R.id.Btn1: numClick("1"); break;
            case R.id.Btn2: numClick("2"); break;
            case R.id.Btn3: numClick("3"); break;
            case R.id.Btn4: numClick("4"); break;
            case R.id.Btn5: numClick("5"); break;
            case R.id.Btn6: numClick("6"); break;
            case R.id.Btn7: numClick("7"); break;
            case R.id.Btn8: numClick("8"); break;
            case R.id.Btn9: numClick("9"); break;
            case R.id.Del: textViewResult.setText("0"); break;
            case R.id.BtnMinus: Minus(); break;
            case R.id.BtnPlus: Plus(); break;
            case R.id.BtnDivide: Slash(); break;
            case R.id.BtnMulty: Multiple(); break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind( this ) ;
            }



    public void numClick(String incomNumber){
if (num == null){
    num = incomNumber;
} else {
    num = num + incomNumber;
}
        textViewResult.setText(num);
    }

public void Plus(){
        lastNumber = Double.parseDouble(textViewResult.getText().toString());
firstNumber = firstNumber + lastNumber;
textViewResult.setText(""+firstNumber);
}


    public void Minus(){
        lastNumber = Double.parseDouble(textViewResult.getText().toString());
        firstNumber = firstNumber - lastNumber;
        textViewResult.setText(""+firstNumber);
    }


    public void Multiple(){
        lastNumber = Double.parseDouble(textViewResult.getText().toString());
        firstNumber = firstNumber * lastNumber;
        textViewResult.setText(""+firstNumber);
    }


    public void Slash(){
try {
    lastNumber = Double.parseDouble(textViewResult.getText().toString());
    firstNumber = firstNumber / lastNumber;
    textViewResult.setText("" + firstNumber);
}catch (NullPointerException){
    textViewResult.setText("0");
}

    }





}