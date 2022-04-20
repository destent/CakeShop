package com.connectyu.test.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class C3p0Utils {
    public static DataSource getDataSource(){return new ComboPooledDataSource();}
}
