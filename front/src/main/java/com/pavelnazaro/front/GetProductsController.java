package com.pavelnazaro.front;

import com.pavelnazaro.common.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GetProductsController {
    private GetProducts getProducts;

    @Autowired
    public void setGetProducts(GetProducts getProducts) {
        this.getProducts = getProducts;
    }

    @RequestMapping(value = "/get-products")
    public String getProducts(Model model){
        List<Product> answer = getProducts.products();
        model.addAttribute("products", answer);
        return "all_products";
    }
}
