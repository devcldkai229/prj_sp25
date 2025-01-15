package devcldkai.sweetdelight;

import devcldkai.sweetdelight.dao.impl.ProductDaoImpl;
import devcldkai.sweetdelight.model.Products;

import java.sql.Date;
import java.util.List;

public class Application {

    public static void main(String[] args){
        List<Products> products = ProductDaoImpl.getInstance().getAllProductsByName("Cake");
        //Products products = ProductDaoImpl.getInstance().getProductById(1000);
        //System.out.println(products);
        Products product = new Products();
        product.setName("Deluxe Pizza");
        product.setPrice(199.99);
        product.setDescription("A delicious pizza with premium toppings.");
        product.setCreatedAt(Date.valueOf("2025-01-09")); // Set thời gian hiện tại
        product.setImageUrl("https://example.com/images/deluxe-pizza.jpg");
        product.setCategoryId(6); // Ví dụ: 1 đại diện cho danh mục Pizza
        product.setStoreId(4);  // ID của cửa hàng bán sản phẩm

        //ProductDaoImpl.getInstance().deleteProduct(1020);

        for(Products p : products){
            System.out.println(p);
        }
    }
}
