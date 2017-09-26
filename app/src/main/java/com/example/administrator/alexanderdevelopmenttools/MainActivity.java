package com.example.administrator.alexanderdevelopmenttools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: 2017/9/26 日志规约
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

}
