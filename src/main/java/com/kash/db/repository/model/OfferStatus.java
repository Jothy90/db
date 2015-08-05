package com.kash.db.repository.model;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: 123
 * Date: 6/9/15
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class OfferStatus {
    int id;
    String sendFrom;
    String sendTo;
    String date;
    String cc;
    String subject;
    String message;

    public String getSendFrom() {
        return sendFrom;
    }

    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static OfferStatus getAMail(){

        Random rand = new Random();
        int max=100;
        int min=1;
        int randomNum = rand.nextInt((max - min) + 1) + min;

        OfferStatus email=new OfferStatus();
        email.setId(randomNum);
        email.setSendTo("Kamalan");
        email.setSendFrom("Kashing");
        email.setSubject("Test");
        email.setDate("2015-06-10");
        email.setMessage("This is a Test Message");
        return email;
    }
}
