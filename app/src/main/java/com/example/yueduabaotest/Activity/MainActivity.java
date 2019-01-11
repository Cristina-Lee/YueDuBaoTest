package com.example.yueduabaotest.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
//import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.yueduabaotest.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup rg_tab_bar;
    private RadioButton rb_stack;
    //Fragment Object
    private StackFragment sfg;
    private BookshelfFragment bsfg;
    private FragmentManager fManager;


    //书架测试
    private Context mContext;
    private GridView grid_shelf;
    private MyAdapter<Book> myAdapter = null;
    private ArrayList<Book> mData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_user=(Button) findViewById(R.id.center_user);//系统主页面个人中心按钮的id‘
        btn_user.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, PersonalCenterActivity.class);//从系统主页面跳转至个人中心界面
                startActivity(intent);
            }
        });


        fManager=getSupportFragmentManager();
        rg_tab_bar=(RadioGroup)findViewById(R.id.rg_tab_bar);
        rg_tab_bar.setOnCheckedChangeListener(this);
        //获取第一个单选按钮，并设置其为选中状态
        rb_stack=(RadioButton)findViewById(R.id.rb_stack);
        rb_stack.setChecked(true);


        //test
        mContext=MainActivity.this;
        init();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId){
        //FragmentTransaction只能使用一次，每次使用都要调用FragmentManager 的beginTransaction()方法获得FragmentTransaction事务对象
        FragmentTransaction fTransaction =fManager.beginTransaction();
        hideAllFragment(fTransaction);
        switch (checkedId){
            case R.id.rb_stack:
                if(sfg==null){
                    sfg=new StackFragment();
                    fTransaction.add(R.id.ly_content, sfg);
                }else{
                    fTransaction.show(sfg);
                }
                break;
            case R.id.rb_bookshelf:
                if(bsfg==null){
                    bsfg=new BookshelfFragment();
                    fTransaction.add(R.id.ly_content, bsfg);
                }else{
                    fTransaction.show(bsfg);
                }
                break;
        }
        fTransaction.commit();
    }

    //隐藏所有Fragment
    private void hideAllFragment(FragmentTransaction fragmentTransaction){
        if(sfg!=null)fragmentTransaction.hide(sfg);
        if(bsfg!=null)fragmentTransaction.hide(bsfg);
    }





    private void init() {

        grid_shelf = (GridView) findViewById(R.id.grid_shelf);

        //数据初始化
        mData = new ArrayList<Book>();
        mData.add(new Book(R.drawable.bookcover,"book1"));
        mData.add(new Book(R.drawable.bookcover,"book2"));
       // mData.add(new Book("R.drawable.bookcover","book3"));
        //mData.add(new Book("R.drawable.bookcover","book4"));
       // mData.add(new Book("R.drawable.bookcover","book5"));
      //  mData.add(new Book("R.drawable.bookcover","book6"));

        //Adapter初始化
        myAdapter = new MyAdapter<Book>(mData,R.layout.itemshelf) {
            @Override
            public void bindView(ViewHolder holder, Book obj) {

                holder.setImageResource(R.id.img_icon,obj.getiId());
                holder.setText(R.id.txt_content,obj.getiName());
            }
        };

        //GridView设置Adapter：
        grid_shelf.setAdapter(myAdapter);

    }


}
