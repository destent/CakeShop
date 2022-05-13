package com.connectyu.test.dao;

import com.connectyu.test.model.CakeType;
import com.connectyu.test.utils.C3p0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class TypeDao {
    public List<CakeType> selectTypes() throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return queryRunner.query("select * from type",new BeanListHandler<>(CakeType.class));
    }
    public CakeType findTypeById(int id) throws SQLException {
        DataSource dataSource = C3p0Utils.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        if(id !=0)
            return queryRunner.query("select * from type where id = ?",new BeanHandler<>(CakeType.class),id);
        else
            return new CakeType(0,"全部系列");
    }
}
