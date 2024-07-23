import java.sql.*;

public class Demo {
    public static void main(String[] argrs) throws SQLException {


        String sql = "SELECT * FROM products WHERE name=?";
        String name = "Asus";
        //String sql = "SELECT name FROM products WHERE id=2";
        //String sql = "SELECT * FROM products";

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "12345678";

        Connection con = DriverManager.getConnection(url, username, password);
        // Statement stmt = con.createStatement();
        // // preparedStatement, CallbackStat
        // ResultSet res = stmt.executeQuery(sql);

        // PREPARED STATEMENT
        // Connection2
        PreparedStatement preparedStmt = con.prepareStatement(sql);
        preparedStmt.setString(1, "Asus");
        ResultSet resultSet = preparedStmt.executeQuery(sql);
        resultSet.next();

        System.out.println(resultSet.getString("name"));

        // String name = res.getString(1);
        //Array names = res.get(1);
        System.out.println(name);
    }
}
