package com.upchiapas.huosebydamo.models;

public interface ValidacionDatos {
    boolean datosVacios ();

    boolean datosVacios(String baños, String internet, String semiamublado, String clima, String ubicacion, String notaExtra, String numeroCotacto);

    boolean datosVacios(String arealavado, String cochera, String ubicacion, String notaExtra, String numeroContacto);
}
