package com.upchiapas.huosebydamo.controller.models;

import java.util.ArrayList;

public class ValidateUser {
    private ArrayList<User> users = new ArrayList<>();

    public ValidateUser(){
        users.add(new User("Dario Antonio","daga","6969"));
        users.add(new User("Jose Angel","magomerlin","1234"));
    }

    public boolean autenticarUser(String username,String password){
        boolean estatuto = false;
        User user = findUser(username);
        if ( user != null && user.getPassword().equals(password))
            estatuto = true;
            return estatuto;
        }

    private User findUser(String username){
        User user = null;
        boolean estatuto = false;
        int index = 0;
        while (!estatuto && index<users.size()){
            if (users.get(index).getUsername().equals(username)){
                user = users.get(index);
                estatuto = true;
            }
            index++;
        }
        return user;
    }
}
