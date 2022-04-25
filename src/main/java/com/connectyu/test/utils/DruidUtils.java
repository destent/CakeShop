package com.connectyu.test.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DruidUtils {
    private DruidUtils(){}
    private static DataSource dataSource;
    static{
        Properties properties = new Properties();
        try {
            properties.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDatasource(){
        return dataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}

