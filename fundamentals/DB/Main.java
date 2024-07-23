package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {

            Connection co = DriverManager.getConnection("jdbc:sqlite:base.db");
            // statement
            Statement stmt = co.createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM products");

            while(res.next()) {
                String name = res.getString("name");
                System.out.println(name);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
