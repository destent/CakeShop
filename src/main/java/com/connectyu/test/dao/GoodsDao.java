package com.connectyu.test.dao;

import com.connectyu.test.model.Goods;
import com.connectyu.test.model.Page;
import com.connectyu.test.utils.C3p0Utils;

import com.connectyu.test.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GoodsDao {

    public List<Goods> findAllGoods() throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from goods", new BeanListHandler<>(Goods.class));
    }
    public  Goods findById(int id) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from goods where id = ?",new BeanHandler<>(Goods.class),id);
    }

    /**
     * 查询指定页显示的商品
     * @param page
     * @return
     * @throws SQLException
     */
    public List<Goods> findPageGoods(Page page) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "select * from goods where id limit ?,?";
        return queryRunner.query(sql,new BeanListHandler<>(Goods.class),
                page.getPageNo()*page.getGoodsNum(),page.getGoodsNum());
    }

    /**
     * 查询商品数
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int countGoodsRow() throws SQLException, ClassNotFoundException {
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select count(id) from goods");
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int i = resultSet.getInt(1);
        JdbcUtils.close(connection,preparedStatement,resultSet);
        return i;
    }
    public List<Goods> findGoodsByType(int type_id) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from goods where type_id = ?",new BeanListHandler<>(Goods.class),type_id);
    }
}
