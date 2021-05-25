package com.example.dem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void message(View view){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);

    }

    public void gmail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT,"Email subject");
        intent.putExtra(Intent.EXTRA_TEXT,"Body of Email");
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"sandesh2552@gmail.com"});
        startActivity(intent);
    }
}
