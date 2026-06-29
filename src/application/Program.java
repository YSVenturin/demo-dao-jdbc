package application;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "John", "john@mail.com", LocalDate.of(2026, 6, 29), 3300.0, obj);
        System.out.println(seller);

        Connection con = DB.getConnection();
        DB.closeConnection();
    }
}
