/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.Servicios;
import com.prueba2.repository.ServiciosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class ServiciosServiceImpl implements ServiciosService {

    @Autowired
    private ServiciosRepository repository;

    @Override
    public Servicios registrar(Servicios servicio) {
        return repository.save(servicio);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Servicios> list() {
        return repository.findAll();
    }
}
