package com.jherrera.myappdiccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityDetalleSW extends AppCompatActivity {
    String nombre,significado;
    TextView textViewNombre,textViewSignificado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_detalle_sw);
        textViewNombre = findViewById(R.id.txtNombreDiccionario);
        textViewSignificado = findViewById(R.id.txtSignificadoDiccionario);
        obtenerDatos();
    }
    private void obtenerDatos(){
        Bundle bundle = getIntent().getExtras();
        nombre = bundle.getString("nombre");
        significado = bundle.getString("significado");
        textViewNombre.setText(nombre);
        textViewSignificado.setText(significado);
    }
}