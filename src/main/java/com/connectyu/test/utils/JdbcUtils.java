package com.connectyu.test.utils;


import java.sql.*;

public class JdbcUtils {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection = null;

            //        加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //        获取链接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cakeshop","root","cgy123");

        return connection;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs){
        close(conn,stmt);
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            rs=null;
        }
    }

    public static void close(Connection conn, Statement stmt){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            conn = null;
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            stmt = null;
        }
    }

}
