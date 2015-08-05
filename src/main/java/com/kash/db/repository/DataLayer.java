package com.kash.db.repository;


import com.kash.db.repository.model.OfferStatus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 6/7/15
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataLayer {

    // when the user login; if it is valid user then return userId else return 0
    public static List<OfferStatus> getAll(){
        List<OfferStatus> list =new ArrayList<>();
        OfferStatus offerStatus;
        String query = "SELECT * FROM tmpOfferStatus ORDER BY rowid ASC";
        System.out.println(query);
        try {
            Connection con = DbConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                offerStatus=new OfferStatus();
                /*id = rs.getInt("user_id");*/
                //TODO:
                list.add(offerStatus);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return list;
    }
}
