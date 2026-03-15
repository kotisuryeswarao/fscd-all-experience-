package com.inventory.main;

import com.inventory.dao.ProductDAO;
import com.inventory.entity.Product;

public class App {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();

        dao.saveProduct(new Product("Laptop",   "Gaming Laptop",    75000.0, 10));
        dao.saveProduct(new Product("Mouse",    "Wireless Mouse",    1200.0, 50));
        dao.saveProduct(new Product("Keyboard", "Mechanical KB",     2500.0, 30));

        System.out.println("Fetched: " + dao.getProduct(1));

        dao.updateProduct(1, 72000.0, 8);
        dao.deleteProduct(2);

        System.out.println("CRUD operations completed.");
    }
}
