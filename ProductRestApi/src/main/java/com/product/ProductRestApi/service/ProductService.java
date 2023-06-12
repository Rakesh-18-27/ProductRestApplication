package com.product.ProductRestApi.service;

import com.product.ProductRestApi.model.ProductModel;

import java.util.List;

public interface ProductService {
List<ProductModel> addproduct(ProductModel productModel);
List<ProductModel> getById(String id);
List<ProductModel> deleteById(String id);

List<ProductModel> getAll();

List<ProductModel> getByCategory(String category);

List<ProductModel> getByCategoryAndSize(String category,String size);

List<ProductModel> getProductByColor(String color);
}
