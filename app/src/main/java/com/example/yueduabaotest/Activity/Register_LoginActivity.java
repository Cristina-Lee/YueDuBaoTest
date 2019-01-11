package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class Register_LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_login);

        //从注册登录主界面返回至系统主页面
        Button button_RL=(Button) findViewById(R.id.btn_BacktoMain);
        button_RL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(Register_LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //从注册登录主页面跳转到登录页面
        Button button_login=(Button) findViewById(R.id.button_login);
        button_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(Register_LoginActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        //从注册登录主页面跳转到注册页面
        Button button_register=(Button) findViewById(R.id.button_register);
        button_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(Register_LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
