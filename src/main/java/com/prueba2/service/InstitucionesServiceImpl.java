/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.Instituciones;
import com.prueba2.repository.InstitucionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class InstitucionesServiceImpl implements InstitucionesService {

    @Autowired
    private InstitucionesRepository repository;

    @Override
    public Instituciones registrar(Instituciones intitucion) {
        return repository.save(intitucion);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Instituciones> list() {
        return repository.findAll();
    }
}
