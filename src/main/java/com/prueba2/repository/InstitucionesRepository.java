/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.repository;

import com.prueba2.entity.Instituciones;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Bryan
 */
public interface InstitucionesRepository extends MongoRepository<Instituciones, String> {

}
