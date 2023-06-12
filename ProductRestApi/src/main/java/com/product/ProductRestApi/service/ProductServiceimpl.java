package com.product.ProductRestApi.service;

import com.product.ProductRestApi.model.ProductModel;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceimpl implements  ProductService{

    List<ProductModel> productModels=new ArrayList<ProductModel>();
    @Override
    public List<ProductModel> addproduct(ProductModel productModel) {
        productModels.add(productModel);
        return productModels;
    }

    @Override
    public List<ProductModel> getById(String id) {
        return productModels.stream().filter(productModel -> productModel.getProductId().equals(id))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductModel> deleteById(String id) {
       List<ProductModel> products=productModels.stream()
               .filter(productModel -> productModel.getProductId().equals(id))
               .collect(Collectors.toList());
       if(products.get(0)!=null){
           productModels.remove(products.get(0));
       }
       return productModels;
    }

    @Override
    public List<ProductModel> getAll() {
        return productModels;
    }

    @Override
    public List<ProductModel> getByCategory(String category) {
        return productModels.stream()
                .filter(productModel -> productModel.getProductname().contains(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductModel> getByCategoryAndSize(String category,String size) {
        return productModels.stream()
                .filter(productModel -> productModel.getProductname().contains(category)&&
                        productModel.getSks().stream().anyMatch(sku->sku.getSkuSize().equalsIgnoreCase(size)))
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductModel> getProductByColor(String color) {
        return productModels.stream()
                .filter(productModel -> productModel.getColors().stream()
                        .anyMatch(str->str.equalsIgnoreCase(color)))
                .collect(Collectors.toList());
    }
}
