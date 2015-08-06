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
    public static List<OfferStatus> getAll() {
        List<OfferStatus> list = new ArrayList<>();
        OfferStatus offerStatus;
        String query1="DROP TEMPORARY TABLE IF EXISTS tmpOfferStatus;";
        String query2 = "CREATE TEMPORARY TABLE tmpOfferStatus\n" +
                "SELECT os.rowid, res.listingid, res.listingstatus, res.listagentagentid,\n" +
                "CONCAT(agentfirstname, ' ', agentlastname) AS NAME, agentcellphone, a.agentemail\n" +
                "FROM carets_res res\n" +
                "JOIN blOfferStatus os ON os.mls = res.listingid\n" +
                "JOIN carets_agent a ON a.agentid = res.listagentagentid;";
        String query3="ALTER TABLE tmpOfferStatus MODIFY listingstatus VARCHAR(25);";

        String query4="INSERT INTO tmpOfferStatus\n" +
                "SELECT os.rowid, res.mlnumber, res.status, res.la_publicid,\n" +
                "CONCAT(a.firstname, ' ', a.lastname) AS NAME, a.cellphone, NULL AS agentemail\n" +
                "FROM crmls_res res\n" +
                "JOIN blOfferStatus os ON os.mls = res.mlnumber\n" +
                "JOIN crmls_agent a ON a.publicid = res.la_publicid;";

        String query="SELECT *\n" +
                "FROM tmpOfferStatus\n" +
                "ORDER BY rowid ASC;";
        try {
            Connection con = DbConnection.getConnection();
            Statement stmt = con.createStatement();
            stmt.execute(query1);
            stmt.execute(query2);
            stmt.execute(query3);
            stmt.execute(query4);
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                offerStatus = new OfferStatus();
                offerStatus.setRowId(rs.getInt("rowid"));
                offerStatus.setListingId(rs.getString("listingid"));
                offerStatus.setListingStatus(rs.getString("listingstatus"));
                offerStatus.setListAgentAgentId(rs.getString("listagentagentId"));
                offerStatus.setAgentCellphone(rs.getString("agentcellphone"));
                offerStatus.setAgentEmail(rs.getString("agentemail"));
                list.add(offerStatus);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return list;
    }
}
