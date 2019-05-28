package com.example.createdashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView c1,c2,c3,c4,c5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().hide();
        //getSupportActionBar().hide();


        c1=(CardView)findViewById(R.id.card1);
        c2=(CardView)findViewById(R.id.card2);
        c3=(CardView)findViewById(R.id.card3);
        c4=(CardView)findViewById(R.id.card4);
        c5=(CardView)findViewById(R.id.card5);



        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);

        //Toast.makeText(MainActivity.this,"cardview1",Toast.LENGTH_LONG).show();





    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.card1:

                Toast.makeText(MainActivity.this,"cardview1",Toast.LENGTH_LONG).show();

                break;
            case R.id.card2:
                Toast.makeText(MainActivity.this,"cardview2",Toast.LENGTH_LONG).show();

                break;
            case R.id.card3:
                Toast.makeText(MainActivity.this,"cardview3",Toast.LENGTH_LONG).show();

                break;
            case R.id.card4:
                Toast.makeText(MainActivity.this,"cardview4",Toast.LENGTH_LONG).show();

                break;

            case R.id.card5:
                Toast.makeText(MainActivity.this,"cardview5",Toast.LENGTH_LONG).show();

                break;
            default:break;
        }
    }
}
