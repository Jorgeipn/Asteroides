package com.ipn.jorge.asteroides;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Puntuaciones extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puntuaciones);

        /*
        setListAdapter(new ArrayAdapter(this, R.layout.elemento_lista,
                R.id.titulo,
                MainActivity.almacen.listaPuntuaciones(10)));
        */

        setListAdapter(new MiAdaptador(this, MainActivity.almacen.listaPuntuaciones(10)));



    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Object o = getListAdapter().getItem(position);
        Toast.makeText(this, "Selección: " + Integer.toString(position)
                +  " - " + o.toString(), Toast.LENGTH_LONG).show();

    }




}
