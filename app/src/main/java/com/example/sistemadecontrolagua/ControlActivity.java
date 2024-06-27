package com.example.sistemadecontrolagua;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ControlActivity extends AppCompatActivity {

    private EditText etFlujo, etTemperatura, etPH, etCloro, etORP, etTDS, etTurbidez;
    private Button btnGuardar, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        etFlujo = findViewById(R.id.etFlujo);
        etTemperatura = findViewById(R.id.etTemperatura);
        etPH = findViewById(R.id.etPH);
        etCloro = findViewById(R.id.etCloro);
        etORP = findViewById(R.id.etORP);
        etTDS = findViewById(R.id.etTDS);
        etTurbidez = findViewById(R.id.etTurbidez);
        btnGuardar = findViewById(R.id.btnGuardar);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnGuardar.setOnClickListener(view -> {
            guardarDatosControl();
        });

        btnRegresar.setOnClickListener(view -> {
            Intent intent = new Intent(ControlActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void guardarDatosControl() {

        Toast.makeText(ControlActivity.this, "Datos de control guardados", Toast.LENGTH_SHORT).show();
    }
}
