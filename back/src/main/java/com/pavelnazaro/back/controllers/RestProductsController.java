package com.pavelnazaro.back.controllers;

import com.pavelnazaro.common.entities.Product;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface RestProductsController {
    @RequestMapping("/products")
    List<Product> products();
}
