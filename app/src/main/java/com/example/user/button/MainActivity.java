package com.example.user.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaration component
    //memberikan nama type dari suatu komponen
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize component
        //menyatakan velue dari suatu komponen
        btn = findViewById(R.id.btntoas);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Ini Toast",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
