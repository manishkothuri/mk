package com.example.attempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.b1:
                openactivity2();
                break;
            case R.id.b2:
                openActivity3();

        }
    }
    public void openactivity2()
    {
        Intent intent= new Intent(this,activity2.class);
        startActivity(intent);
    }
    public void openActivity3()
    {
        Intent intent1= new Intent(this,Activity3.class);
        startActivity(intent1);
    }
}
