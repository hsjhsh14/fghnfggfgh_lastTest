package com.example.user.fghnfggfgh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button main_tun_but;
    Button main_ep_but;
    Button main_hot_but;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        main_tun_but = findViewById(R.id.main_tun_but);
        main_tun_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Toon_Activity.class);
                startActivity(intent);
            }
        });

        main_ep_but = findViewById(R.id.main_ep_but);
        main_ep_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Episode_Activity.class);
                startActivity(intent);

            }
        });

        main_hot_but = findViewById(R.id.main_hot_but);
        main_hot_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),HotSsul_Activity.class);
                startActivity(intent);
            }
        });




    }
}
