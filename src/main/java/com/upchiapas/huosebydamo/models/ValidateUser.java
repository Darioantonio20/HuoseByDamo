package com.upchiapas.huosebydamo.models;

public class ValidateUser implements ValidacionDatos{

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

    public static boolean ValidacionDatosUser (String nombre,String apellidos,String correoElectronico, String numeroTelefono,String nombreUsuario,String contraseña){
       boolean validacion;
        if(nombre!= ""){
            if (apellidos!= ""){
                if (correoElectronico !=""){
                    if (numeroTelefono!= ""){
                        if (nombreUsuario!=""){
                            if (contraseña != null){
                                validacion= true;
                            }else {validacion=false;}
                        }else {validacion=false;}
                    }else {validacion=false;}
                }else {validacion=false;}
            }else {validacion=false;}
        }else {validacion=false;}
        return validacion;
    }

    @Override
    public boolean datosVacios() {
        return false;
    }

    @Override
    public boolean datosVacios(String baños, String internet, String semiamublado, String clima, String ubicacion, String notaExtra, String numeroCotacto) {
        boolean status;
        if (baños!=""){
            if (internet!=""){
                if (semiamublado!=""){
                    if (clima!=""){
                        if (ubicacion!=""){
                            if (notaExtra!=""){
                                if (numeroCotacto!=""){
                                    status=true;
                                }else {status=false;}
                            }else {status=false;}
                        }else {status=false;}
                    }else {status=false;}
                }else {status=false;}
            }else {status=false;}
        }else {status=false;}
       return status;
    }
    @Override
    public boolean datosVacios(String arealavado, String cochera, String ubicacion, String notaExtra, String numeroContacto){
        boolean status;
        if (arealavado!=""){
            if (cochera!=""){
                if (ubicacion!=""){
                    if (notaExtra!=""){
                        if (numeroContacto!=""){
                            status=true;
                        }else {status=false;}
                    }else {status=false;}
                }else {status=false;}
            }else {status=false;}
        }else {status=false;}
        return status;
    }

    public static boolean usuarioRep (String nombreUsuario){
        boolean status =false;
        for (int i=0; i<Almacenamiento.datausers.size(); i++){
            if (nombreUsuario.equals(Almacenamiento.datausers.get(i).getNombreUsuario())){
                status =true;
            }
        }
        return status;
    }
}
