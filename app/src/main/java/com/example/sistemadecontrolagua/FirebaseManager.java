package com.example.sistemadecontrolagua;

import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseManager {

    private static final String TAG = "FirebaseManager";
    private DatabaseReference mDatabase;

    // Singleton instance
    private static FirebaseManager instance;

    private FirebaseManager() {
        // Obtener referencia a la base de datos
        mDatabase = FirebaseDatabase.getInstance().getReference();
    }

    public static synchronized FirebaseManager getInstance() {
        if (instance == null) {
            instance = new FirebaseManager();
        }
        return instance;
    }


    public void agregarReporte(String tipo, String mensaje) {
        String key = mDatabase.child("reportes").push().getKey();
        Reporte reporte = new Reporte(getCurrentDate(), tipo, mensaje);
        mDatabase.child("reportes").child(key).setValue(reporte)
                .addOnSuccessListener(aVoid -> Log.d(TAG, "Reporte agregado correctamente"))
                .addOnFailureListener(e -> Log.w(TAG, "Error al agregar reporte", e));
    }

    private String getCurrentDate() {

        return "2024-06-23";
    }

    public void agregarReporte(String reporte) {
    }
}
