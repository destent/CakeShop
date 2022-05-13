package com.connectyu.test.dao;

import com.connectyu.test.model.Order;
import com.connectyu.test.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.sql.SQLException;

public class OrderDao {
    public void insert(Order order){
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        Object[] o={
                order.getTotal(),
                order.getAmount(),
                order.getStatus(),
                order.getPaytype(),
                order.getName(),
                order.getPhone(),
                order.getAddress(),
                order.getDatetime(),
                order.getUserId()
        };
        try {
            queryRunner.insert("insert into `order`(total, amount, status, paytype, name, phone, address, datetime, user_id) values (?,?,?,?,?,?,?,?,?)",new BeanHandler<>(Object.class),o);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
