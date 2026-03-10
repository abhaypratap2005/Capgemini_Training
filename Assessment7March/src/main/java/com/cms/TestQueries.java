package com.cms;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestQueries {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String q1 = "SELECT s.sname FROM Supplier s";
        List<String> suppliers = session.createQuery(q1).list();
        System.out.println("Supplier Names:");
        suppliers.forEach(System.out::println);


        String q2 = "FROM Supplier s WHERE s.city='Delhi'";
        List<Supplier> delhi = session.createQuery(q2).list();
        System.out.println("Suppliers from Delhi:");
        delhi.forEach(s -> System.out.println(s.getSname()));

        String q3 = "SELECT sp.item.name FROM Supply sp WHERE sp.supplier.sid=1";
        List<String> items = session.createQuery(q3).list();
        System.out.println("Items supplied by supplier 1:");
        items.forEach(System.out::println);

        session.close();
        factory.close();
    }
}
