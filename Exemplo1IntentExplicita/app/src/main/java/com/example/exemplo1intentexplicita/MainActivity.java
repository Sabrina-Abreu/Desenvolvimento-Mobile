package com.example.exemplo1intentexplicita;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnAbrir2Activity,btnAbrir3Activity, btnAbrir4Activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnAbrir2Activity = (Button) findViewById(R.id.cmdAbrir2Activity);
        btnAbrir3Activity = (Button) findViewById(R.id.cmdAbrir3Activity);
        btnAbrir4Activity = (Button) findViewById(R.id.cmdAbrir4Activity);

        btnAbrir2Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



    }
}