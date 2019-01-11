package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //从注册页面返回至注册登录主页面
        Button button=(Button) findViewById(R.id.btn_register_BacktoRL);//注册页面返回按钮的id
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(RegisterActivity.this, Register_LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
