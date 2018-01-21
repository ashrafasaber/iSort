package com.example.android.isort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public void sortBtnClick(View view){
        Intent intent =  new Intent(SelectionActivity.this, CameraActivity.class);
        startActivity(intent);
    }

    public void statsBtnClick(View view){
        Intent intent =  new Intent(SelectionActivity.this, StatActivity.class);
        startActivity(intent);
    }
}
