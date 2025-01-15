package devcldkai.sweetdelight.dao;

import devcldkai.sweetdelight.model.Products;

import java.util.List;

public interface ProductDao {

    List<Products> getAllProducts();

    Products getProductById(int id);

    List<Products> getAllProductsByName(String name);

    void saveProduct(Products product);

    void deleteProduct(int id);
}
