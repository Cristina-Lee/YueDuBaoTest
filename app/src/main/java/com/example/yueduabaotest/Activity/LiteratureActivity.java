package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yueduabaotest.R;

public class LiteratureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.literature);
        Button button_novel=(Button) findViewById(R.id.btn_BacktoBC_3);
        button_novel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(LiteratureActivity.this,BookClassifyActivity.class);
                startActivity(intent);
            }
        });

    }
}
