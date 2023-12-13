/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.Persistence;

import com.mycompany.login.Logica.User;
import java.util.List;

/**
 *
 * @author caled
 */
public class PersistenceController {
    UserJpaController userJpa = new UserJpaController();

    public List<User> getUsers() {
        return userJpa.findUserEntities();
    }
    
}
