/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.User;
import java.util.List;

/**
 *
 * @author Bryan
 */
public interface UserService {

    public abstract User registrar(User user);

    public abstract User login(String usu, String pass);

    public abstract void delete(String id);

    public abstract List<User> list();
}
