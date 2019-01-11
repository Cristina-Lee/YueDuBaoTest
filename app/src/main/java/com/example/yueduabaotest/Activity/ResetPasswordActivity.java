package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);

        //从设置新密码界面返回至账号密码页面
        Button button_resetBack=(Button) findViewById(R.id.btn_resetBack);
        button_resetBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(ResetPasswordActivity.this, SetPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}
