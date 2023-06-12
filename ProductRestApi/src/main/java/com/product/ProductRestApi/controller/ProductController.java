package com.product.ProductRestApi.controller;

import com.product.ProductRestApi.model.ProductModel;
import com.product.ProductRestApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public List<ProductModel> add(@RequestBody ProductModel productModel){
        return productService.addproduct(productModel);
    }

    @GetMapping("/getAll")
    public List<ProductModel> getAll(){
        return productService.getAll();
    }

    @DeleteMapping("/deleteById/{id}")
    public List<ProductModel> deleteByid(@PathVariable String id){
        return productService.deleteById(id);
    }

    @GetMapping("/getById/{id}")
    public List<ProductModel> getById(@PathVariable String id){
        return productService.getById(id);
    }

    @GetMapping("/getByCategory/{category}")
    public List<ProductModel> getShirts(@PathVariable String category){
    return productService.getByCategory(category);
    }

    @GetMapping("/getBySizeAndCategory/{category}/{size}")
    public List<ProductModel> getBySizeAndCategory(@PathVariable String category,@PathVariable String size){
        return productService.getByCategoryAndSize(category,size);
    }

    @GetMapping("/getProductsByColor/{color}")
    public List<ProductModel> getProductsByColor(@PathVariable String color){
        return productService.getProductByColor(color);
    }
}
