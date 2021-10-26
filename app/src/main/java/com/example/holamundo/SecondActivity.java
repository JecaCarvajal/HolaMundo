package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //GetExtras();
    }

    public void gotoActivityMaiun(View view)
    {
        Intent newIntent = new Intent(this, MainActivity.class);
        startActivity(newIntent);
    }
    public void GetExtras()
    {
        Bundle extras = getIntent().getExtras();
        String msg =  extras.getString("msg");
        String saludo =  extras.getString("saludo");
        Toast toast = Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG);
        toast.setMargin(100,100);
        toast.show();
    }
}