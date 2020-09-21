package com.pavelnazaro.front;

import com.pavelnazaro.common.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("back")
public interface GetProducts {
    @RequestMapping("/market/products")
    List<Product> products();
}
