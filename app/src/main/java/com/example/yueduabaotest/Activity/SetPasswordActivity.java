package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class SetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_password);

        //从账号密码页面返回至个人中心界面
        Button button_sp_center=(Button) findViewById(R.id.btn_BacktoPC_1);
        button_sp_center.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(SetPasswordActivity.this, PersonalCenterActivity.class);
                startActivity(intent);
            }
        });

        //从账号密码页面跳转至设置新密码页面
        Button button_to_reset=(Button) findViewById(R.id.reset);
        button_to_reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(SetPasswordActivity.this, ResetPasswordActivity.class);
                startActivity(intent);
            }
        });


    }
}
