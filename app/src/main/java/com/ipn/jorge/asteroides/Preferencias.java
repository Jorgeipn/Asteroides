package com.ipn.jorge.asteroides;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;
/**
 * Created by Jorge on 28/10/2016.
 */

public class Preferencias extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenciasFragment()).commit();
    }


}
