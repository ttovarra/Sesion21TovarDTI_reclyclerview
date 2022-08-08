package com.example.sesion21tovardti_reclyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cagarDatos();//llamada o invaca metodo cargarDatos
    }
    //metodo paa cagarDatos en el ReclyclerView
    public void cagarDatos(){
        //generacion de arrayList
        elements = new ArrayList<>();

        elements.add(new ListElement("#775447","TV Smart","NY","Activo"));
        elements.add(new ListElement("#000FFF","Tablet","US","Inactivo"));
        elements.add(new ListElement("#FFF000","Pantalla 90","UK","Activo"));
        elements.add(new ListElement("#000FFF","Tablet","US","Inactivo"));
        elements.add(new ListElement("#009688","PC","NG","Activo"));
        elements.add(new ListElement("#F44336","Tablet","US","Inactivo"));

        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.listReclyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(listAdapter);

    }


}