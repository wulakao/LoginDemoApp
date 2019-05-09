package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.activity.ResultActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.loginbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = ((EditText)findViewById(R.id.username)).getText().toString();
                String pwd = ((EditText)findViewById(R.id.password)).getText().toString();
                if(username.equals("17023129")&&pwd.equals("password17023129")){
                    Intent intent=new Intent();
                    intent.setClass(MainActivity.this, ResultActivity.class);
                    startActivity(intent);
                }else{

                }
            }
        });
    }
}
