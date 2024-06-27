package com.example.sistemadecontrolagua;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.firestore.FirebaseFirestore;

public class ReporteDelDiaActivity extends AppCompatActivity {

    private TextView tvReporte;
    private Button btnRegresar;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_del_dia);

        tvReporte = findViewById(R.id.tvReporte);
        btnRegresar = findViewById(R.id.btnRegresar);
        db = FirebaseFirestore.getInstance();


        obtenerReporteDelDia();

        btnRegresar.setOnClickListener(view -> {

            finish();
        });
    }

    private void obtenerReporteDelDia() {

        tvReporte.setText("Datos del reporte del día:\nFlujo: 10 L/s\nTemperatura: 25°C\npH: 7.0\nCloro: 0.5 ppm\nORP: 650 mV\nTDS: 500 ppm\nTurbidez: 1 NTU");
    }
}
