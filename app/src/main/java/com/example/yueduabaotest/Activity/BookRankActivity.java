package com.example.yueduabaotest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.yueduabaotest.R;

public class BookRankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_rank);
        View linkReg1 = findViewById((R.id.linkReg1));
        linkReg1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(BookRankActivity.this,BestSellerActivity.class);
                startActivity(i);
            }
        });
        View linkReg2 = findViewById((R.id.linkReg2));
        linkReg2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(BookRankActivity.this,NewbookActivity.class);
                startActivity(i);
            }
        });

        View linkReg3 = findViewById((R.id.linkReg3));
        linkReg3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(BookRankActivity.this,SoaringActivity.class);
                startActivity(i);
            }
        });
        View linkReg4 = findViewById((R.id.lingkReg4));
        linkReg4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(BookRankActivity.this,RewardActivity.class);
                startActivity(i);
            }
        });

    }

}