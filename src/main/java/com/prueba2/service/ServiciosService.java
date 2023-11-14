/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba2.service;

import com.prueba2.entity.Servicios;
import java.util.List;

/**
 *
 * @author Bryan
 */
public interface ServiciosService {

    public abstract Servicios registrar(Servicios servicio);

    public abstract void delete(String id);

    public abstract List<Servicios> list();
}
