package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button=(Button) findViewById(R.id.btn_login_BacktoRL);//登录界面返回按钮的id
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(LoginActivity.this, Register_LoginActivity.class);//从登录界面返回至注册登录主界面
                startActivity(intent);
            }
        });
    }
}
