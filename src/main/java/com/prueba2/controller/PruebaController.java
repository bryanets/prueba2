/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bryan
 */
@RestController
@RequestMapping("/api/demo")
//@CrossOrigin(origins = "https://service-production-8a5d.up.railway.app")
public class PruebaController {

    @GetMapping("/lista")
    public ResponseEntity<Map<String, String>> lista() {
        System.out.println("Estos es la lista 1");
        return new ResponseEntity<>(
                Map.of("message", "Hello my friend!"),
                HttpStatus.OK
        );
    }

    @GetMapping("/lista2")
    public ResponseEntity<Map<String, String>> lista2() {
        System.out.println("Estos es la lista 2");
        return new ResponseEntity<>(
                Map.of("message", "Hello my friend!"),
                HttpStatus.OK
        );
    }
}
