package com.kash.db.repository;


import com.kash.db.repository.model.LoginUser;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 6/7/15
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataLayer {

    // when the user login; if it is valid user then return userId else return 0
    public static int getUserId(LoginUser loginUser){
        int id = 0;
        String query = "select user_id from login where user_name = '" + loginUser.getUserName() +"' and password = '" + loginUser.getPassword()+"'" ;
        System.out.println(query);
        try {
            Connection con = DbConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                id = rs.getInt("user_id");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        return id;
    }

}
