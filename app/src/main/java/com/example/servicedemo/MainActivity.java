package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("lifecycle","onCreate invoked");
        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycle","onStart invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycle","onPause invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycle","onResume invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycle","onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycle","onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycle","onDestroy invoked");
    }
}