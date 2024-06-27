package com.example.sistemadecontrolagua;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class AlertasActivity extends AppCompatActivity {

    private Button btnRegresar;
    private TextView tvMensajeAlerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertas);

        // Inicialización de vistas
        tvMensajeAlerta = findViewById(R.id.tvMensajeAlerta);
        btnRegresar = findViewById(R.id.btnRegresar);


        btnRegresar.setOnClickListener(view -> {
            Intent intent = new Intent(AlertasActivity.this, MainActivity.class);
            startActivity(intent);
        });

        actualizarMensajeAlerta("La calidad del agua está en mal estado. Se requiere acción inmediata.");
    }

    private void actualizarMensajeAlerta(String mensaje) {
        tvMensajeAlerta.setText(mensaje);
    }
}

