package com.pavelnazaro.back.controllers;

import com.pavelnazaro.back.services.ProductsService;
import com.pavelnazaro.common.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestProductsControllerImpl implements RestProductsController {
    private ProductsService productsService;

//    @Qualifier
//    @Lazy
//    private EurekaClient eurekaClient;
//
//    @Value("back")
//    private String appName;

    @Autowired
    public RestProductsControllerImpl(ProductsService productsService) {
        this.productsService = productsService;
    }

    @Override
    @RequestMapping(value = "/products")
    public List<Product> products(){
        return productsService.findAll();
    }
}
