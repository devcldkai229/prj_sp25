package devcldkai.sweetdelight.mapper;

import devcldkai.sweetdelight.model.Products;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {

    private ProductMapper() {}

    public static Products mapToProducts(ResultSet resultSet) throws SQLException {
        Products products = new Products();
        products.setId(resultSet.getLong("id"));
        products.setName(resultSet.getString("name"));
        products.setPrice(resultSet.getDouble("price"));
        products.setDescription(resultSet.getString("description"));
        products.setCreatedAt(resultSet.getDate("created_at"));
        products.setSalesCount(resultSet.getLong("sales_count"));
        products.setRate(resultSet.getDouble("rate"));
        products.setStatus(resultSet.getString("status"));
        products.setImageUrl(resultSet.getString("image_url"));
        products.setCategoryId(resultSet.getInt("category_id"));
        products.setStoreId(resultSet.getInt("store_id"));
        return products;
    }
}
