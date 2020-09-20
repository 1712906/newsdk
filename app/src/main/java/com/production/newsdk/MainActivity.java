package com.production.newsdk;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.production.mylibrary.mylibraryMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            mylibraryMain.setAuher("com.production.newsdk");
            mylibraryMain.setUri(getApplicationContext());
            Intent intent =new Intent(this, mylibraryMain.class);
            ComponentName componentName=new ComponentName(this, mylibraryMain.class);
            intent.setComponent(componentName);
            startActivity(intent);
        }
        catch (Exception e) {
            System.out.println("Aaaaa"+e.toString());
        }
    }
}
