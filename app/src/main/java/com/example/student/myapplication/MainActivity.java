package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener//m5
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn3;//m3
    ToggleButton tb;//m6
    Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*btn3=findViewById(R.id.button3);//m3
        MyListener listener=new MyListener();
        btn3.setOnClickListener(listener);*/
        /*btn3 = findViewById(R.id.button3);//m4,匿名類別 常用用法.結果與m3一樣
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "工作xxxx", Toast.LENGTH_SHORT).show();
            }
        });*/
        s=findViewById(R.id.switch1);
        btn3 = (Button) findViewById(R.id.button3);//m5
        btn3.setOnClickListener(this);
        tb=(ToggleButton)findViewById(R.id.toggleButton);//m6
        tb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "切換", Toast.LENGTH_SHORT).show();//m5
                if (tb.isChecked())//af1

                {
                    Toast.makeText(MainActivity.this, "open", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "close", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
    public void click1(View v)
    /*{
        Toast.makeText(this,"工作好累",Toast.LENGTH_SHORT).show();//this=MainActivity.this//m1
    }*/ {
        switch (v.getId())//m2
        {
            case R.id.button:
                Toast.makeText(this, "工作好累", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "工作真累", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View view)//m5
    {
        switch (view.getId())
        {
            case R.id.button3:
                Toast.makeText(MainActivity.this, "工作xxxx", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void click2(View v)//af1
    {
        if(tb.isChecked())
        {
            Toast.makeText(MainActivity.this, "open", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "close", Toast.LENGTH_SHORT).show();
        }
    }
}
        /*class MyListener implements View.OnClickListener//m3
        {

            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "工作xxxx", Toast.LENGTH_SHORT).show();
            }
        }*/





