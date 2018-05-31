package com.github.wally.contextprovider.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.wally.contextprovider.ContextProvider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //如果这里能打印，则使用ContentProvider获取Context成功
        Toast.makeText(ContextProvider.get().getContext(), "获取Context成功", Toast.LENGTH_SHORT).show();
    }
}