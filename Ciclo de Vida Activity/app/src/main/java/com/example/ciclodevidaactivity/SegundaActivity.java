package com.example.ciclodevidaactivity;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("Tela 2 Ciclo de Vida 1", "Método onStart ativado!!!!");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Tela 2 Ciclo de Vida 1", "Método onStart ativado!!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Tela 2 Ciclo de Vida 1", "Método onResume ativado!!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Tela 2 Ciclo de Vida 1", "Método onResume ativado!!!!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Tela 2 Ciclo de Vida 1", "Método onResume ativado!!!!");
    }
}
