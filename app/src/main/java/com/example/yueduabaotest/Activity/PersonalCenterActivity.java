package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.yueduabaotest.R;

public class PersonalCenterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_center);

        RelativeLayout layout_1= findViewById(R.id.account_password);// 个人中心界面中账号密码布局的获取
        RelativeLayout layout_2=findViewById(R.id.user_card);//个人中心界面中账户卡片布局的获取
        Button button_1=(Button)findViewById(R.id.btn_back_center) ;
        layout_1.setOnClickListener(PersonalCenterActivity.this);
        //需要传入接口实现类的实例
        //此时接口实现类的实例为PersonalCenterActivity
        layout_2.setOnClickListener(PersonalCenterActivity.this);
        button_1.setOnClickListener(PersonalCenterActivity.this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.account_password:
                //点击后想要实现的效果：点击账号密码之后，从个人中心界面跳转至账号密码界面
                Intent intent_1=new Intent(PersonalCenterActivity.this, SetPasswordActivity.class);
                startActivity(intent_1);
                break;
            case R.id.user_card:
                //点击后想要实现的效果：点击用户卡片之后，从个人中心界面跳转至个人信息界面
                Intent intent_2=new Intent(PersonalCenterActivity.this, PersonalInfoActivity.class);
                startActivity(intent_2);
                break;
            case R.id.btn_back_center://从个人中心界面返回至主界面
                Intent intent_b1=new Intent(PersonalCenterActivity.this, MainActivity.class);
                startActivity(intent_b1);

               // default:
                  //  Toast.makeText(PersonalCenterActivity.this, "点击账号密码出错", Toast.LENGTH_SHORT).show();
                    //弹出消息：点击账号密码出错
        }
    }



}
