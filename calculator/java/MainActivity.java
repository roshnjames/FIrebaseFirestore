package com.example.calculator;

import javax.swing.text.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String op1="",op2="",operator="";
    float val1,val2,result=0;
    boolean flag=false,flag1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView expr=(TextView) findViewById(R.id.tv1);

        Button one=(Button)findViewById(R.id.one);
        Button two=(Button)findViewById(R.id.two);
        Button three=(Button)findViewById(R.id.three);
        Button four=(Button)findViewById(R.id.four);
        Button five=(Button)findViewById(R.id.five);
        Button six=(Button)findViewById(R.id.six);
        Button seven=(Button)findViewById(R.id.seven);
        Button eight=(Button)findViewById(R.id.eight);
        Button nine=(Button)findViewById(R.id.nine);
        Button zero=(Button)findViewById(R.id.zero);
        Button plus=(Button)findViewById(R.id.plus);
        Button minus=(Button)findViewById(R.id.minus);
        Button div=(Button)findViewById(R.id.div);
        Button mul=(Button)findViewById(R.id.mul);
        Button mod=(Button)findViewById(R.id.mod);
        Button reset=(Button)findViewById(R.id.reset);
        Button point=(Button)findViewById(R.id.point);
        Button submit=(Button)findViewById(R.id.equals);



        //operand

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="1";
                }else{
                    op2+="1";
                }
                expr.append("1");

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="2";
                }else{
                    op2+="2";
                }
                expr.append("2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="3";
                }else{
                    op2+="3";
                }
                expr.append("3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="4";
                }else{
                    op2+="4";
                }
                expr.append("4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="5";
                }else{
                    op2+="5";
                }
                expr.append("5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="6";
                }else{
                    op2+="6";
                }
                expr.append("6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="7";
                }else{
                    op2+="7";
                }
                expr.append("7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="8";
                }else{
                    op2+="8";
                }
                expr.append("8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="9";
                }else{
                    op2+="9";
                }
                expr.append("9");

            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+="0";
                }else{
                    op2+="0";
                }
                expr.append("0");

            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false && flag1==false){
                    op1+=".";
                }else{
                    op2+=".";
                }
                expr.append(".");

            }
        });


        //operator
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=true;
                operator="+";
                expr.append(" + ");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=true;
                operator="*";
                expr.append(" * ");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=true;
                operator="-";
                expr.append(" - ");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=true;
                operator="/";
                expr.append(" / ");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag=true;
                operator="%";
                expr.append(" % ");
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op1.isEmpty() || op2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter values", Toast.LENGTH_SHORT).show();
                }else{
                flag1=true;
                val1=Float.parseFloat(op1);
                val2=Float.parseFloat(op2);


                    switch(operator){
                        case "+":result=val1+val2;
                            break;
                        case "-":result=val1-val2;
                            break;
                        case "/":result=val1/val2;
                            break;
                        case "*":result=val1*val2;
                            break;
                        case "%":result=val1%val2;
                            break;
                        default:result=0;
                            Toast.makeText(MainActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    expr.setText(String.valueOf(result));
                    flag=flag1=true;
                    op1=String.valueOf(result);
                    op2="";
                    val1=0;
                    val2=0;
                    result=0;
                    operator="";

            }}
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expr.setText("");
                val1=0;
                val2=0;
                op1="";
                op2="";
                result=0;
                flag=flag1=false;
                operator="";

            }
        });


    }
}
