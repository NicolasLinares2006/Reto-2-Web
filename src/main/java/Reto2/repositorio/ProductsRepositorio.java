/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2.repositorio;

import Reto2.interfaces.InterfaceProducts;
import Reto2.modelo.Products;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class ProductsRepositorio {
    @Autowired
    private InterfaceProducts repository;

    public List<Products> getAll() {
        return repository.findAll();
    }

    public Optional<Products> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Products create(Products clothe) {
        return repository.save(clothe);
    }

    public void update(Products clothe) {
        repository.save(clothe);
    }
    
    public void delete(Products clothe) {
        repository.delete(clothe);
    }
}
