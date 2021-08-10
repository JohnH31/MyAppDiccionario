package com.jherrera.myappdiccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.jherrera.myappdiccionario.complementos.DiccionarioVO;
import com.jherrera.myappdiccionario.complementos.MetodosSW;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivityMostrarSW extends AppCompatActivity implements Response.Listener<JSONObject>, Response.ErrorListener {
    ListView listView;
    ArrayList<String> listaDatos;
    ArrayList<DiccionarioVO> listaDiccionarioVO;
    MetodosSW metodosSW = new MetodosSW();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mostrar_sw);
        listView = findViewById(R.id.lvListasDiccionario);
        metodosSW.consultaSW(this,this,this);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                trasladoInformacion(position);
            }
        });
    }

    private void resultadoConsultaCompleta(JSONObject response){
        DiccionarioVO DiccionarioVO;
        JSONArray jsonArray = response.optJSONArray("tbl_palabra");
        listaDiccionarioVO = new ArrayList<>();
        try {
            for(int i=0;i<jsonArray.length();i++){
                DiccionarioVO = new DiccionarioVO();
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                DiccionarioVO.setId_palabra(jsonObject.optInt("id_palabra"));
                DiccionarioVO.setNombre_palabra(jsonObject.optString("nombre_palabra"));
                DiccionarioVO.setSignificado_palabra(jsonObject.optString("significado_palabra"));

                listaDiccionarioVO.add(DiccionarioVO);
            }
            listaDatos = new ArrayList<>();
            for (int i=0; i<listaDiccionarioVO.size();i++){
                if (listaDiccionarioVO.get(i).getId_palabra() != 0) {
                    listaDatos.add(listaDiccionarioVO.get(i).getId_palabra() + ". " + listaDiccionarioVO.get(i).getNombre_palabra());
                }
                else {
                    Toast.makeText(this, "Lista Vacia", Toast.LENGTH_SHORT).show();
                }
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaDatos);
            listView.setAdapter(arrayAdapter);
        }
        catch (Exception e){
            Toast.makeText(this, "Error referente a C", Toast.LENGTH_SHORT).show();
            System.err.println("C....."+e.getCause()+"------"+e.getMessage());
        }
    }
    private void trasladoInformacion(int position){
        String nombreD,significadoD;
        nombreD = listaDiccionarioVO.get(position).getNombre_palabra();
        significadoD = listaDiccionarioVO.get(position).getSignificado_palabra();

        Intent intent = new Intent(getApplicationContext(),MainActivityDetalleSW.class);
        intent.putExtra("nombre",nombreD);
        intent.putExtra("significado",significadoD);
        startActivity(intent);
    }


    @Override
    public void onResponse(JSONObject response) {
        this.resultadoConsultaCompleta(response);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(this, "Error respuesta C", Toast.LENGTH_SHORT).show();
        System.err.println("C....."+error);
    }

}