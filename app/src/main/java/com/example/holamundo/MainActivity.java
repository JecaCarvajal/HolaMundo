package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_send);
        EditText editText = (EditText) findViewById(R.id.phone);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                //double sqrt = Math.sqrt(Double.parseDouble(text));
                Toast toast =Toast.makeText(getApplicationContext(),text, Toast.LENGTH_LONG);
                toast.setMargin(100,100);
                toast.show();
            }
        });
    }
    public void gotoActivity2(View view)
    {
        Intent newIntent = new Intent(this, SecondActivity.class);
        startActivity(newIntent);
        newIntent.putExtra("msg", "Hola activity 2");
        newIntent.putExtra("saludo", "Bienvenido");
    }
}