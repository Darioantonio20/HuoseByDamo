package com.upchiapas.huosebydamo.models;

public class Departamento {
    double dimensiones;
    String baños;
    String internet;
    String semiamublado;
    byte limiteDePersonas;
    String clima;
    String ubicacion;
    String notaExtra;
    String numeroCotacto;
    String usuarioPropietario;

    public Departamento(double dimensiones, String baños, String internet, String semiamublado, byte limiteDePersonas, String clima, String ubicacion, String notaExtra, String numeroCotacto, String usuarioPropietario) {
        this.dimensiones = dimensiones;
        this.baños = baños;
        this.internet = internet;
        this.semiamublado = semiamublado;
        this.limiteDePersonas = limiteDePersonas;
        this.clima = clima;
        this.ubicacion = ubicacion;
        this.notaExtra = notaExtra;
        this.numeroCotacto = numeroCotacto;
        this.usuarioPropietario = usuarioPropietario;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getBaños() {
        return baños;
    }

    public void setBaños(String baños) {
        this.baños = baños;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getSemiamublado() {
        return semiamublado;
    }

    public void setSemiamublado(String semiamublado) {
        this.semiamublado = semiamublado;
    }

    public byte getLimiteDePersonas() {
        return limiteDePersonas;
    }

    public void setLimiteDePersonas(byte limiteDePersonas) {
        this.limiteDePersonas = limiteDePersonas;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNotaExtra() {
        return notaExtra;
    }

    public void setNotaExtra(String notaExtra) {
        this.notaExtra = notaExtra;
    }

    public String getNumeroCotacto() {
        return numeroCotacto;
    }

    public void setNumeroCotacto(String numeroCotacto) {
        this.numeroCotacto = numeroCotacto;
    }

    public String getUsuarioPropietario() {
        return usuarioPropietario;
    }

    public void setUsuarioPropietario(String usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
    }

    @Override
    public String toString() {
        return
                "///////////////////////////////////////////////////////////////////////////////////////////\n" +
                        "                                            Departamento                              " +"\n\n"+
                        " Dimensiones del departamento: " + dimensiones + "\n"+
                        " Tiene baños: " + baños +"\n"+
                        " Tiene internet: " + internet +"\n"+
                        " Esta semi-amueblabo: " + semiamublado +"\n"+
                        " Número de limite de personas: " + limiteDePersonas + "\n"+
                        " Tiene clima: " + clima + "\n"+
                        " Úbicacion: " + ubicacion + "\n"+
                        " Nota extra: " + notaExtra + "\n"+
                        " Número de contacto del arrendador: " + numeroCotacto + "\n"+
                        " Usuario propietario: "+ usuarioPropietario + "\n" +
                        "///////////////////////////////////////////////////////////////////////////////////////////";

    }
}
