/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.provider;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ProductProviderImplement implements ProductProviderInterface{

    @Override
    public List<String> getProducts() {
        return Arrays.asList(" Air Condition, Refrizarator, Television, Home Theater, Electric Fan");
    }
    
}
