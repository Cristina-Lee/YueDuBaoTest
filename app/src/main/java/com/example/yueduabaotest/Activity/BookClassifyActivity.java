package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class BookClassifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_classify);//加载书籍分类界面
        Button button1=(Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(BookClassifyActivity.this,NovelActivity.class);
                startActivity(intent);
            }
        });
        Button button2=(Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(BookClassifyActivity.this,BiographyActivity.class);
                startActivity(intent);
            }
        });
        Button button3=(Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(BookClassifyActivity.this,LiteratureActivity.class);
                startActivity(intent);
            }
        });
        Button button4=(Button)findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(BookClassifyActivity.this,SuspenseActivity.class);
                startActivity(intent);
            }
        });
        Button button5=(Button)findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(BookClassifyActivity.this,CateActivity.class);
                startActivity(intent);
            }
        });
        Button button6=(Button)findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(BookClassifyActivity.this,RelaxationActivity.class);
                startActivity(intent);
            }
        });
    }




}
