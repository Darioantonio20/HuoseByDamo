package com.upchiapas.huosebydamo.controller.models;

public class Casa {
    private double dimensiones ;
    private byte pisos ;
    private byte cuartos;
    private  byte baños ;
    private String arealavado ;
    private String cochera ;
    private String ubicacion ;
    private String notaExtra ;
    private String numeroContacto;

    public Casa(double dimensiones, byte pisos, byte cuartos, byte baños, String arealavado, String cochera, String ubicacion, String notaExtra, String numeroContacto) {
        this.dimensiones = dimensiones;
        this.pisos = pisos;
        this.cuartos = cuartos;
        this.baños = baños;
        this.arealavado = arealavado;
        this.cochera = cochera;
        this.ubicacion = ubicacion;
        this.notaExtra = notaExtra;
        this.numeroContacto = numeroContacto;
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public byte getPisos() {
        return pisos;
    }

    public void setPisos(byte pisos) {
        this.pisos = pisos;
    }

    public byte getCuartos() {
        return cuartos;
    }

    public void setCuartos(byte cuartos) {
        this.cuartos = cuartos;
    }

    public byte getBaños() {
        return baños;
    }

    public void setBaños(byte baños) {
        this.baños = baños;
    }

    public String getArealavado() {
        return arealavado;
    }

    public void setArealavado(String arealavado) {
        this.arealavado = arealavado;
    }

    public String getCochera() {
        return cochera;
    }

    public void setCochera(String cochera) {
        this.cochera = cochera;
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

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {

        return  "|///////////////////////////////////////////////////////////////////////\n" +
                "|                                                Casa                                    " + "\n" + "|\n" +
                "| Dimensiones =-:-:-= " + dimensiones + "\n"+
                "|\n" +
                "| Pisos =-:-:-= " + pisos +"\n"+
                "|\n" +
                "| Cuartos =-:-:-= " + cuartos +"\n"+
                "|\n" +
                "| Baños =-:-:-= " + baños +"\n"+
                "|\n" +
                "| Área de lavado =-:-:-= " + arealavado + "\n"+
                "|\n" +
                "| Cochera =-:-:-= " + cochera + "\n"+
                "|\n" +
                "| Ubicacion =-:-:-= " + ubicacion + "\n"+
                "|\n" +
                "| Nota extra =-:-:-= " + notaExtra + "\n"+
                "|\n" +
                "| Número de contacto =-:-:-= " + numeroContacto +"\n"+
                "|///////////////////////////////////////////////////////////////////////";
    }
}
