package jdbc;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Queries {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","blackthorne");
        System.out.println("Connection Established");

        // Insert

//        PreparedStatement pst = connection.prepareStatement("insert into products values (?, ?, ?)");
//        pst.setInt(1, 100);
//        pst.setString(2, "Pen");
//        pst.setFloat(3, 5.5F);
//
//        int res = pst.executeUpdate();
//
//        System.out.println("Inserted rows:" + res);

        // Select

//        Statement st = connection.createStatement();
//        ResultSet rs = st.executeQuery("select * from products");
//        while(rs.next()){
//            System.out.println("===============================");
//            System.out.println("Id=" + rs.getInt(1));
//            System.out.println("Name=" + rs.getString(2));
//            System.out.println("Price=" + rs.getFloat(3));
//            System.out.println("===============================");
//        }

        connection.close();
    }
}
