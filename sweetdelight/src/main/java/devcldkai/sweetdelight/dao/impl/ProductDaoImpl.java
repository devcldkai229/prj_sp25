package devcldkai.sweetdelight.dao.impl;

import devcldkai.sweetdelight.dao.ProductDao;
import devcldkai.sweetdelight.mapper.ProductMapper;
import devcldkai.sweetdelight.model.Products;
import devcldkai.sweetdelight.queries.ProductQueries;
import devcldkai.sweetdelight.utils.DatabaseUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    public static ProductDao getInstance(){
        return new ProductDaoImpl();
    }

    @Override
    public List<Products> getAllProducts() {
        List<Products> productList = new ArrayList<>();
        try {
            Connection connection = DatabaseUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ProductQueries.SELECT_ALL_PRODUCTS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                productList.add(ProductMapper.mapToProducts(resultSet));
            }
            return productList;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public Products getProductById(int id) {
        Products products = null;
        try {
            Connection connection = DatabaseUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ProductQueries.SELECT_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()) {
                    products = ProductMapper.mapToProducts(resultSet);
                }
            }
            return products;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public List<Products> getAllProductsByName(String name) {
        List<Products> productList = new ArrayList<>();
        try {
            Connection connection = DatabaseUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ProductQueries.SELECT_PRODUCT_BY_NAME);
            preparedStatement.setString(1, "%" + name + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                productList.add(ProductMapper.mapToProducts(resultSet));
            }
            return productList;
        } catch(SQLException e){
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public void saveProduct(Products product) {
        try{
            Connection connection = DatabaseUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ProductQueries.SAVE_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setDate(4, product.getCreatedAt());
            preparedStatement.setLong(5, product.getSalesCount());
            preparedStatement.setDouble(6, product.getRate());
            preparedStatement.setString(7, product.getStatus());
            preparedStatement.setString(8, product.getImageUrl());
            preparedStatement.setInt(9, product.getCategoryId());
            preparedStatement.setInt(10, product.getStoreId());

            preparedStatement.executeUpdate(); // tương đương save và update
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int id) {
        try{
            Connection connection = DatabaseUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(ProductQueries.DELETE_PRODUCT_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate(); // tương đương save và update và delete
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
