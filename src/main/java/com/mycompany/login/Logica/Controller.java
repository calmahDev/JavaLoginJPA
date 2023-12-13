/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.Logica;

import com.mycompany.login.Persistence.PersistenceController;
import java.util.List;


public class Controller {
    PersistenceController perController;

    public Controller() {
        perController  = new PersistenceController();
    }



    public String validateUser(String user, String password) {
        String message = "";
        List<User> listUsers = perController.getUsers();
        for(User usu : listUsers){
            System.out.println("usuario" + usu);
            if(usu.getUserName().equals(user)){
                if(usu.getPassword().equals(password)){
                    message = "User and password is corret, welcome to system";
                }else{
                    message = "Password is incorrect";
                }
            }else{
                message = "User not found";
            }
        }
        return message;
    }
}
