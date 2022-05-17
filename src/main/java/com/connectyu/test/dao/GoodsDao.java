package com.connectyu.test.dao;

import com.connectyu.test.model.Goods;
import com.connectyu.test.model.Page;
import com.connectyu.test.utils.C3p0Utils;

import com.connectyu.test.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

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
    public List<Goods> findPageGoods(Page page,int typeId) throws SQLException {
        if (typeId == 0)
           return findPageGoods(page);
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "select * from (select * from goods where type_id = ?) as q where id limit ?,?";
        return queryRunner.query(sql,new BeanListHandler<>(Goods.class),
                typeId,page.getPageNo()*page.getGoodsNum(),page.getGoodsNum());
    }
    /**
     * 查询商品数
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int countGoodsRow(){
        String sql = "select count(id) as count from goods";
        QueryRunner queryRunner = new QueryRunner(C3p0Utils.getDataSource());
        try {
            Long count = queryRunner.query(sql, new ScalarHandler<>("count"));
            return count.intValue();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }

    /**
     * 查询指定类型商品数
     * @param typeId
     * @return
     */
    public int countGoodsRow(int typeId){
        if (typeId == 0)
           return countGoodsRow();
        String sql = "select count(id) as count from goods where type_id = ?";
        QueryRunner queryRunner = new QueryRunner(C3p0Utils.getDataSource());
        try {
            Long count = queryRunner.query(sql, new ScalarHandler<>("count"),typeId);
            return count.intValue();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
    public int findGoodsCount(){
        String sql = "select count(id) as count from goods";
        QueryRunner queryRunner = new QueryRunner(C3p0Utils.getDataSource());
        try {
            Long count = queryRunner.query(sql, new ScalarHandler<>("count"));
            return count.intValue();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
    public List<Goods> findGoodsByType(int type_id) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        if(type_id!=0)
            return queryRunner.query("select * from goods where type_id = ?",new BeanListHandler<>(Goods.class),type_id);
        else
            return queryRunner.query("select * from goods",new BeanListHandler<>(Goods.class));
    }
}
