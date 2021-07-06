package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        System.out.println("在master分支提交第一次");
        System.out.println("在master分支提交第二次");
        System.out.println("在sunyidong的分支提交一次");
        System.out.println("在sunyidong的分支提交2次");
        System.out.println("在sunyidong的分支提交2次");
    }
}