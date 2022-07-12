package com.upchiapas.huosebydamo.models;

import java.util.ArrayList;

public class ValidateUser {

    public boolean autenticarUser(String username,String password){
        boolean estatuto = false;
        for (int i=0;i<Almacenamiento.datausers.size();i++){
            Usuario user = findUser(username);
            if ( user != null &&  Almacenamiento.datausers.get(i).getContraseña().equals(password)){
                estatuto = true;
            }
        }
        return estatuto;
    }

    private Usuario findUser(String username){
        Usuario user = null;
        boolean estatuto = false;
        int index = 0;
        while (!estatuto && index<Almacenamiento.datausers.size()){
            if (Almacenamiento.datausers.get(index).getNombreUsuario().equals(username)){
                user = Almacenamiento.datausers.get(index);
                estatuto = true;
            }
            index++;
        }
        return user;
    }
}
