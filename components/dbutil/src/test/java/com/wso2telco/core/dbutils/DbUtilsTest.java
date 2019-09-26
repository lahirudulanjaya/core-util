package com.wso2telco.core.dbutils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class DbUtilsTest {
    DbUtils dbUtils;

    @BeforeTest
    public void setUp(){
        dbUtils =DbUtils.getInstance();
    }

    @Test
    public void testGetInstance() throws SQLException, DBUtilException {
        DbUtils.getInstance();
       // Assertions.assertThat(DbUtils.getInstance()).isEqualTo(com.wso2telco.core.dbutils.DbUtils@3d8314f0");

        dbUtils.initializeDatasources();
    }

}