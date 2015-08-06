package com.kash.db.repository.model;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 6/9/15
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class OfferStatus {
    private int rowId;
    private String listingId;
    private String listingStatus;
    private String listAgentAgentId;
    private String agentCellphone;
    private String agentEmail;

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getListingStatus() {
        return listingStatus;
    }

    public void setListingStatus(String listingStatus) {
        this.listingStatus = listingStatus;
    }

    public String getListAgentAgentId() {
        return listAgentAgentId;
    }

    public void setListAgentAgentId(String listAgentAgentId) {
        this.listAgentAgentId = listAgentAgentId;
    }

    public String getAgentCellphone() {
        return agentCellphone;
    }

    public void setAgentCellphone(String agentCellphone) {
        this.agentCellphone = agentCellphone;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    @Override
    public String toString() {
        return "OfferStatus{" +
                "rowId=" + rowId +
                ", listingId='" + listingId + '\'' +
                ", listingStatus='" + listingStatus + '\'' +
                ", listAgentAgentId='" + listAgentAgentId + '\'' +
                ", agentCellphone='" + agentCellphone + '\'' +
                ", agentEmail='" + agentEmail + '\'' +
                '}';
    }
}
