package com.product.ProductRestApi.model;

import java.util.List;

public class ProductModel {
    private String productId;
    private String productname;
    private List<SkuModel> sks;
    private List<String> colors;
    public List<String> getColors() {
        return colors;
    }
    public void setColors(List<String> colors) {
        this.colors = colors;
    }
    public ProductModel() {
        super();
    }
    public ProductModel(String productId, String productname) {
        super();
        this.productId = productId;
        this.productname = productname;
    }
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productname=" + productname + ", sks=" + sks +", "+colors+ "]";
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public List<SkuModel> getSks() {
        return sks;
    }
    public void setSks(List<SkuModel> sks) {
        this.sks = sks;
    }
}
