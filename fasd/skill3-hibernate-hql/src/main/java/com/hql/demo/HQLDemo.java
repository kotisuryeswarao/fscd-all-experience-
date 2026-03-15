package com.hql.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.hql.entity.Product;
import com.hql.loader.ProductDataLoader;
import com.hql.util.HibernateUtil;
import java.util.List;

public class HQLDemo {

    // Task 3a — Sort by price ASC
    public static void sortByPriceAsc(Session s) {
        List<Product> list = s.createQuery("FROM Product p ORDER BY p.price ASC", Product.class).list();
        System.out.println("\n=== Sorted by Price (ASC) ===");
        list.forEach(p -> System.out.println(p.getName() + " - $" + p.getPrice()));
    }

    // Task 3b — Sort by price DESC
    public static void sortByPriceDesc(Session s) {
        List<Product> list = s.createQuery("FROM Product p ORDER BY p.price DESC", Product.class).list();
        System.out.println("\n=== Sorted by Price (DESC) ===");
        list.forEach(p -> System.out.println(p.getName() + " - $" + p.getPrice()));
    }

    // Task 4 — Sort by quantity DESC
    public static void sortByQuantityDesc(Session s) {
        List<Product> list = s.createQuery("FROM Product p ORDER BY p.quantity DESC", Product.class).list();
        System.out.println("\n=== Sorted by Quantity (DESC) ===");
        list.forEach(p -> System.out.println(p.getName() + " - Qty: " + p.getQuantity()));
    }

    // Task 5 — Pagination
    public static void paginate(Session s, int pageNumber, int pageSize) {
        Query<Product> q = s.createQuery("FROM Product p", Product.class);
        q.setFirstResult((pageNumber - 1) * pageSize);
        q.setMaxResults(pageSize);
        System.out.println("\n=== Page " + pageNumber + " (size=" + pageSize + ") ===");
        q.list().forEach(p -> System.out.println(p.getName()));
    }

    // Task 6 — Aggregates
    public static void aggregates(Session s) {
        Long count = s.createQuery("SELECT COUNT(p) FROM Product p", Long.class).uniqueResult();
        Double min  = s.createQuery("SELECT MIN(p.price) FROM Product p", Double.class).uniqueResult();
        Double max  = s.createQuery("SELECT MAX(p.price) FROM Product p", Double.class).uniqueResult();
        System.out.println("\n=== Aggregates ===");
        System.out.println("Count: " + count + "  Min: $" + min + "  Max: $" + max);
    }

    // Task 6b — In stock count
    public static void inStockCount(Session s) {
        Long count = s.createQuery(
            "SELECT COUNT(p) FROM Product p WHERE p.quantity > 0", Long.class).uniqueResult();
        System.out.println("Products in stock: " + count);
    }

    // Task 6c — Group by description
    public static void countByCategory(Session s) {
        List<Object[]> results = s.createQuery(
            "SELECT p.description, COUNT(p) FROM Product p GROUP BY p.description", Object[].class).list();
        System.out.println("\n=== Count by Category ===");
        results.forEach(r -> System.out.println(r[0] + ": " + r[1] + " products"));
    }

    // Task 8 — Price range filter
    public static void priceRange(Session s, double min, double max) {
        List<Product> list = s.createQuery(
            "FROM Product p WHERE p.price BETWEEN :min AND :max", Product.class)
            .setParameter("min", min).setParameter("max", max).list();
        System.out.println("\n=== Products $" + min + " - $" + max + " ===");
        list.forEach(p -> System.out.println(p.getName() + " - $" + p.getPrice()));
    }

    // Task 9 — LIKE queries
    public static void likeSearch(Session s, String pattern) {
        s.createQuery("FROM Product p WHERE p.name LIKE :pat", Product.class)
         .setParameter("pat", pattern)
         .list().forEach(p -> System.out.println(p.getName()));
    }

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();

        try {
            // Uncomment to load data (run once):
            // ProductDataLoader.loadSampleProducts(session);

            sortByPriceAsc(session);
            sortByPriceDesc(session);
            sortByQuantityDesc(session);
            paginate(session, 1, 3);
            paginate(session, 2, 3);
            aggregates(session);
            inStockCount(session);
            countByCategory(session);
            priceRange(session, 20.0, 100.0);

            System.out.println("\n=== LIKE: names starting with D ===");
            likeSearch(session, "D%");

        } finally {
            session.close();
            factory.close();
        }
    }
}
