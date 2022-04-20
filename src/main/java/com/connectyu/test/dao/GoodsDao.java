package com.connectyu.test.dao;

import com.connectyu.test.model.Goods;
import com.connectyu.test.utils.C3p0Utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class GoodsDao {

    public List<Goods> findAllGoods() throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from goods", new BeanListHandler<>(Goods.class));
    }
}
