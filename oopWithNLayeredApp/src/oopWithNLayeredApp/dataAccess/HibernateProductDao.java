package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product) {
        System.out.print(product.getName());
        System.out.println(" Hibernate ilə verilənlər bazasına əlavə olundu");
    }
}
