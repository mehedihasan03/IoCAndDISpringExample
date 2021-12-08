package com.example.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.example.provider.ProductProviderInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplement implements ProductServiceInterface {

    @Autowired
    private ProductProviderInterface productProvider;

    @Override
    public void print() {
        productProvider.getProducts().stream().forEach(System.out::print);
    }

}
