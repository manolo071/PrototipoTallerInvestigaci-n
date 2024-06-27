package com.example.sistemadecontrolagua;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnAlertas;
    private Button btnReportes;
    private Button btnChatBot;
    private Button btnControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertas = findViewById(R.id.btn_Alertas);
        btnReportes = findViewById(R.id.btn_Reportes);
        btnChatBot = findViewById(R.id.btn_ChatBot);
        btnControl = findViewById(R.id.btn_Control);

        btnAlertas.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AlertasActivity.class);
            startActivity(intent);
        });

        btnReportes.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ReportesActivity.class);
            startActivity(intent);
        });

        btnChatBot.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ChatBotActivity.class);
            startActivity(intent);
        });

        btnControl.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ControlActivity.class);
            startActivity(intent);
        });
    }

}
