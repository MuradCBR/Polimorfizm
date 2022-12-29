package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        System.out.print(product.getName());
        System.out.println(" JDBC ilə verilənlər bazasına əlavə olundu");
    }

}
