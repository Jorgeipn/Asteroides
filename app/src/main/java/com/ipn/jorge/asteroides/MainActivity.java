package com.ipn.jorge.asteroides;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSalir = (Button) findViewById(R.id.Button04);
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public void lanzarAcercaDe(View view){
        Intent i= new Intent(this, AcercaDe.class);
        startActivity(i);
    }

    public void lanzarPreferencias(View view){
        Intent i= new Intent(this, Preferencias.class);
        startActivity(i);
    }

    public void mostrarPreferencias(View view){

        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        String s = " Música: "+ pref.getBoolean("musica",true)
                +"\n Gráficos: " + pref.getString("graficos","?")
                +"\n Fragmentos: " + pref.getString("fragmentos","?")
                +"\n Multiplayer: " + pref.getBoolean("multiplayer", false)
                +"\n NumJugadores: " + pref.getString("numJugadores","?")
                +"\n Conexion: " + pref.getString("conexion","?");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }



    /*
    *
    * Codigo del menú
    ********************************************** */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            lanzarPreferencias(null);
            return true;
        }
        if (id == R.id. acercaDe) {
            lanzarAcercaDe(null);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    /*
    *
    * **********************************************/

}
