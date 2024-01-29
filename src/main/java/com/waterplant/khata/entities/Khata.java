package com.waterplant.khata.entities;

import jakarta.persistence.*;

import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
@Table
public class Khata {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long khataId;
    private String date;

    private double number;

    @ManyToOne
    private Account account;

    public long getKhataId() {
        return khataId;
    }

    public void setKhataId(long khataId) {
        this.khataId = khataId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Khata() {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        this.date = simpleDateFormat.format(new Date());

    }

    public Khata(String date, double number, Account account) {
        this.date = date;
        this.number = number;
        this.account = account;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
