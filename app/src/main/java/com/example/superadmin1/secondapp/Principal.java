package com.example.superadmin1.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void onClick(View view){
        Intent intent = new Intent(Principal.this,Second.class);
        intent.putExtra("name","juan");
        startActivity(intent);
    }
    public void onClick2 (View view){
        Intent intent = new Intent(Principal.this,Third.class);
        intent.putExtra("name","juan");
        startActivity(intent);
    }
}
