package devcldkai.sweetdelight;

import devcldkai.sweetdelight.dao.impl.ProductDaoImpl;
import devcldkai.sweetdelight.model.Products;

import java.util.List;

public class Application {

    public static void main(String[] args){
        List<Products> products = ProductDaoImpl.getInstance().getAllProducts();

        for(Products p : products){
            System.out.println(p);
        }
    }
}
