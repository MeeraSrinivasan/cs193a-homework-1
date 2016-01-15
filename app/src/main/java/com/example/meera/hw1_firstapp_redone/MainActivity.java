package com.example.meera.hw1_firstapp_redone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findLang(View view){
        int id = view.getId();
        if(id == R.id.English){
            ImageButton eng = (ImageButton) findViewById(R.id.English);
            eng.setImageResource(R.drawable.engwer);
        }
        else if(id == R.id.French){
            ImageButton french = (ImageButton) findViewById(R.id.French);
            french.setImageResource(R.drawable.frenchwer);
        }
        else{
            ImageButton spanish = (ImageButton) findViewById(R.id.Spanish);
            spanish.setImageResource(R.drawable.spanswer);
        }
    }
}
