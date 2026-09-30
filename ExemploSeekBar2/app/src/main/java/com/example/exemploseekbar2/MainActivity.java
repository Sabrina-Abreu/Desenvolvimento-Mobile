package com.example.exemploseekbar2;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBarTamanho;
    ShapeableImageView imageViewPerfil;
    TextView tvValor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvValor = (TextView) findViewById(R.id.lblValor);
        seekBarTamanho = (SeekBar) findViewById(R.id.seekBarTamanho);
        imageViewPerfil = (ShapeableImageView) findViewById(R.id.imgPerfil);
        seekBarTamanho.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvValor.setText(progress+"dp");
                float densidade = getResources().getDisplayMetrics().density;
                int tamanhoEmPixels = (int) (progress+densidade);
                ViewGroup.LayoutParams params =imageViewPerfil.getLayoutParams();
                params.width = tamanhoEmPixels;
                params.height=tamanhoEmPixels;
                imageViewPerfil.setLayoutParams(params);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}