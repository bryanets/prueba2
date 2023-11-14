/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.entity;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Bryan
 */
@Getter
@Setter
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private String user;
    private String password;
    private Map<String, Object> movimientos;
}
