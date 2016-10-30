package com.ipn.jorge.asteroides;

import java.util.Vector;

/**
 * Created by Jorge on 29/10/2016.
 */

public interface AlmacenPuntuaciones {

    public void guardarPuntuacion(int puntos,String nombre,long fecha);

    public Vector listaPuntuaciones(int cantidad);
}
