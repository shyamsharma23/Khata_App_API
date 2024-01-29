package com.waterplant.khata.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Entity
@Table
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accId;

    private double sum;
//    @OneToMany
//    private List<Khata> khataList;

    public Account() {
    }

    public Account(long accId, double sum) {
        this.accId = accId;
        this.sum = sum;

    }

    public long getAccId() {
        return accId;
    }

    public void setAccId(long accId) {
        this.accId = accId;
    }


    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

//    public List<Khata> getKhataList() {
//        return khataList;
//    }
//
//    public void setKhataList(List<Khata> khataList) {
//        this.khataList = khataList;
//    }

    public void addNewSum(double sum){
        this.sum += sum;

    }
}
