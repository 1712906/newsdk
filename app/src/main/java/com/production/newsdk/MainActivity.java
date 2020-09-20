package com.production.newsdk;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            com.production.mylibrary.mylibrary.setAuher("com.production.newsdk");
            com.production.mylibrary.mylibrary.setUri(getApplicationContext());
            Intent intent =new Intent(this,com.production.mylibrary.mylibrary.class);
            ComponentName componentName=new ComponentName(this,com.production.mylibrary.mylibrary.class);
            intent.setComponent(componentName);
            startActivity(intent);
        }
        catch (Exception e) {
            System.out.println("Aaaaa"+e.toString());
        }
    }
}
