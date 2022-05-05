package com.connectyu.test.dao;

import com.connectyu.test.model.User;
import com.connectyu.test.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.sql.SQLException;

public class UserDao {
    /**
     * 通过用户名，密码查询用户
     * @param username
     * @param password
     * @return User对象
     * @throws SQLException
     */
    public User login(String username, String password) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from user where username = ? and password = ?",
                new BeanHandler<>(User.class), username, password);
    }
    /**
     * 通过用户名查询用户
     * @param username
     * @return  user对象
     * @throws SQLException
     */
    public User findUserByUsername(String username) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from user where username = ?", new BeanHandler<>(User.class), username);
    }

    /**
     * 通过邮箱查询用户
     * @param email
     * @return user对象
     * @throws SQLException
     */
    public User findUserByEmail(String email) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from user where email = ?", new BeanHandler<>(User.class), email);
    }

    /**
     * 添加用户
     * @param user
     * @return 返回值    含义
     *          1       添加成功
     *          2       用户名已存在
     *          3       邮箱已被使用
     * @throws SQLException
     */
    public int addUser(User user) throws SQLException {
        if (findUserByUsername(user.getUsername())!=null)
            return 2;
        else if(findUserByEmail(user.getEmail())!=null)
            return 3;
        else {
            DataSource dataSource = C3p0Utils.getDataSource();
            QueryRunner queryRunner = new QueryRunner(dataSource);
            Object[] p= {
                    user.getUsername(),
                    user.getEmail(),
                    user.getPassword(),
                    user.getName(),
                    user.getPhone(),
                    user.getAddress(),
                    user.getIsadmin(),
                    user.getIsvalidate()
            };
            return queryRunner.update("insert into user(username, email, password, name, phone, address, isadmin, isvalidate) " +
                    "values (?,?,?,?,?,?,?,?)", p);
        }
    }
    public int update(String password,int id) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.update("update user set password = ? where id  = ?",password,id);
    }
    public int update(String name,String phone,String address,int id) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.update("update user set name = ?,phone = ?,address = ? where id = ?",name,phone,address,id);
    }
}
