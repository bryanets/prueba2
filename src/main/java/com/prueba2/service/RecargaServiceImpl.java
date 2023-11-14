/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.Recarga;
import com.prueba2.repository.RecargaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan
 */
@Service
public class RecargaServiceImpl implements RecargaService {

    @Autowired
    private RecargaRepository repository;

    @Override
    public Recarga registrar(Recarga recarga) {
        return repository.save(recarga);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Recarga> list() {
        return repository.findAll();
    }
}
