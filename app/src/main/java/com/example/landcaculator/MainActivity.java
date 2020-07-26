package com.example.landcaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textCalculate;
    private Button clearBtn;
    private Button signChangeBtn;
    private Button shareBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button multiplicationBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button substractionBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button plusBtn;
    private Button zeroBtn;
    private Button pointBtn;
    private Button equalsBtn;
    private static String firstValueStr;
    private static double firstValueDoub;
    private static int firstValueInt;
    private static String secondValueStr;
    private static double secondValueDoub;
    private static int secondValueInt;
    private static String resultStr;
    private static double resultValueDoub;
    private static int resultInt;
    private static int operationChanged = 0;// 1-share, multiplication - 2; substraction -3, plus -4
    private static boolean deleteFirstZero = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textCalculate = findViewById(R.id.textCalculate);
        clearBtn = findViewById(R.id.clearBtn);
        signChangeBtn = findViewById(R.id.signChangeBtn);
        shareBtn = findViewById(R.id.shareBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        multiplicationBtn = findViewById(R.id.multiplicationBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        substractionBtn = findViewById(R.id.subtractionBtn);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        plusBtn = findViewById(R.id.plusBtn);
        zeroBtn = findViewById(R.id.zeroBtn);
        pointBtn = findViewById(R.id.pointBtn);
        equalsBtn = findViewById(R.id.equallyBtn);


        View.OnClickListener onClickListenerNumbers = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.clearBtn:
                        textCalculate.setText("0");
                        deleteFirstZero = false;
                        firstValueInt = 0;
                        secondValueInt = 0;
                        resultInt = 0;
                        operationChanged = 0;

                        break;
                    case R.id.signChangeBtn:
                        firstValueInt *= (-1);
                        textCalculate.setText(String.valueOf(firstValueInt));
                        break;
                    case R.id.shareBtn:
                        if (operationChanged == 0) {
                            operationChanged = 1;
                            textCalculate.setText(textCalculate.getText() + " / ");
                            secondValueInt = firstValueInt;
                            firstValueInt = 0;
                        } else {
                            Toast.makeText(MainActivity.this, "вы выбрали другое действие", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.sevenBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "7";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "7");
                        break;
                    case R.id.eightBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "8";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "8");
                        break;
                    case R.id.nineBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "9";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "9");
                        break;
                    case R.id.multiplicationBtn:
                        if (operationChanged == 0) {
                            operationChanged = 2;
                            textCalculate.setText(textCalculate.getText() + " * ");
                            secondValueInt = firstValueInt;
                            firstValueInt = 0;
                        } else {
                            Toast.makeText(MainActivity.this, "вы выбрали другое действие", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.fourBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "4";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "4");
                        break;
                    case R.id.fiveBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "5";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "5");
                        break;
                    case R.id.sixBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "6";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "6");
                        break;
                    case R.id.subtractionBtn:
                        if (operationChanged == 0) {
                            operationChanged = 3;
                            textCalculate.setText(textCalculate.getText() + " - ");
                            secondValueInt = firstValueInt;
                            firstValueInt = 0;
                        } else {
                            Toast.makeText(MainActivity.this, "вы выбрали другое действие", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.oneBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "1";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "1");
                        break;
                    case R.id.twoBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "2";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "2");
                        break;
                    case R.id.threeBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("");
                        }
                        deleteFirstZero = true;
                        firstValueStr = firstValueInt + "3";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "3");
                        break;
                    case R.id.plusBtn:
                        if (operationChanged == 0) {
                            operationChanged = 4;
                            textCalculate.setText(textCalculate.getText() + " + ");
                            secondValueInt = firstValueInt;
                            firstValueInt = 0;
                        } else {
                            Toast.makeText(MainActivity.this, "вы выбрали другое действие", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.zeroBtn:
                        if(!deleteFirstZero){
                            textCalculate.setText("0");
                            break;
                        }
                        firstValueStr = firstValueInt + "0";
                        firstValueInt = Integer.parseInt(firstValueStr);
                        textCalculate.setText(textCalculate.getText() + "0");
                        break;
                    case R.id.pointBtn:
                        if(operationChanged != 0){

                            Toast toast  = Toast.makeText(MainActivity.this, "закончите операцию", Toast.LENGTH_SHORT );
                            toast.getGravity();
                            toast.show();

                        } else{
                            deleteFirstZero = true;
                            firstValueDoub = firstValueInt;
                            textCalculate.setText(textCalculate.getText() + ".");}

                        break;
                    case R.id.equallyBtn:
                        resultInt = result(secondValueInt,firstValueInt,operationChanged);
                        textCalculate.setText(String.valueOf(resultInt));
                        firstValueInt = resultInt;
                        operationChanged = 0;
                        secondValueInt = 0;
                        deleteFirstZero = false;
                }
            }
        };
        clearBtn.setOnClickListener(onClickListenerNumbers);
        signChangeBtn.setOnClickListener(onClickListenerNumbers);
        shareBtn.setOnClickListener(onClickListenerNumbers);
        sevenBtn.setOnClickListener(onClickListenerNumbers);
        eightBtn.setOnClickListener(onClickListenerNumbers);
        nineBtn.setOnClickListener(onClickListenerNumbers);
        multiplicationBtn.setOnClickListener(onClickListenerNumbers);
        fourBtn.setOnClickListener(onClickListenerNumbers);
        fiveBtn.setOnClickListener(onClickListenerNumbers);
        sixBtn.setOnClickListener(onClickListenerNumbers);
        substractionBtn.setOnClickListener(onClickListenerNumbers);
        oneBtn.setOnClickListener(onClickListenerNumbers);
        twoBtn.setOnClickListener(onClickListenerNumbers);
        threeBtn.setOnClickListener(onClickListenerNumbers);
        plusBtn.setOnClickListener(onClickListenerNumbers);
        zeroBtn.setOnClickListener(onClickListenerNumbers);
        pointBtn.setOnClickListener(onClickListenerNumbers);
        equalsBtn.setOnClickListener(onClickListenerNumbers);
    }

    private int result(int secondValue, int firstValue, int operation) {
        int result = 0;
        switch (operation) {
            case 1:
                if (firstValue != 0) {
                    result = secondValue / firstValue;

                } else if(firstValueInt == 0){
                    Toast.makeText(MainActivity.this, "Вы не можете делить на ноль", Toast.LENGTH_SHORT).show();
                    return 0;
                }
                break;
            case 2:
                result = secondValue * firstValue;
                break;
            case 3:
                result = secondValue - firstValue;
                break;
            case 4:
                result = secondValue + firstValue;
                break;
        }
        return result;
    }

}