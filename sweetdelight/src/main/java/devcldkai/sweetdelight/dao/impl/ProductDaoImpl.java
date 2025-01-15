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
        return null;
    }

    @Override
    public List<Products> getAllProductsByName(String name) {
        return List.of();
    }
}
