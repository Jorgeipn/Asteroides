package com.ipn.jorge.asteroides;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Jorge on 29/10/2016.
 */

public class PreferenciasFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}
