package com.example.superadmin1.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Third extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner animalSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        localDataSpinner();
        getData2();
    }
    public void localDataSpinner(){
        animalSpinner = (Spinner) findViewById(R.id.animal);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.animal,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        animalSpinner.setAdapter(adapter);
        animalSpinner.setOnItemSelectedListener(this);
    }
    public void getData2(){
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String animal = (String) adapterView.getSelectedItem();
        Toast.makeText(this, animal, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
