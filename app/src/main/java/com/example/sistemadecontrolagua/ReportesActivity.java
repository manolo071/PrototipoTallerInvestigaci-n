package com.example.sistemadecontrolagua;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ReportesActivity extends AppCompatActivity {

    private Button btnGenerarReporte;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);

        btnGenerarReporte = findViewById(R.id.btnGenerarReporte);
        btnRegresar = findViewById(R.id.btnRegresar);

        btnGenerarReporte.setOnClickListener(view -> {
            // Aquí puedes agregar la lógica para generar el reporte
            String reporte = "Reporte generado para el día"; // Aquí deberías generar tu reporte real
            guardarReporte(reporte);
        });

        btnRegresar.setOnClickListener(view -> {
            // Regresar a la actividad principal
            Intent intent = new Intent(ReportesActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void guardarReporte(String reporte) {
        // Guardar el reporte en Firebase u otra fuente de datos
        // Aquí debes implementar tu lógica para guardar el reporte
        // Por ahora, solo muestra un mensaje de ejemplo
        Toast.makeText(ReportesActivity.this, "Reporte Generado para el día", Toast.LENGTH_SHORT).show();

        // Después de guardar el reporte, navegar a la actividad de reporte del día
        Intent intent = new Intent(ReportesActivity.this, ReporteDelDiaActivity.class);
        startActivity(intent);
    }
}
