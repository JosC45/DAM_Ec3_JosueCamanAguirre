package com.example.dam_ec3_josuecamanaguirre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button registrate = findViewById(R.id.btn_registrate);
        registrate.setOnClickListener(view -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());

        Button entrar = findViewById(R.id.btn_entrar);
        entrar.setOnClickListener(view -> Toast.makeText(this, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show());

    }
}