package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevel() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckedTable = "SELECT count(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckedTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0,howMany);
    }
    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"0\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //When
        String sql = "CALL updateBestseller()";
        statement.execute(sql);
        //Then
        String sqlChecked = "SELECT count(*) AS COUNTED FROM BOOKS WHERE BESTSELLER=\"1\"";
        ResultSet resultSet = statement.executeQuery(sqlChecked);
        int result = 0;
        if (resultSet.next()) {
            result = resultSet.getInt("COUNTED");
        }
        Assert.assertEquals(1,result);

    }
}
