package com.waterplant.khata.entities;


import jakarta.persistence.*;

@Entity
@Table
public class Grahak {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long grahakId;
    private String name;

    @OneToOne
    private Account account;

    private long number;

    public Grahak(long grahakId, String name, Account account, int number) {
        this.grahakId = grahakId;
        this.name = name;
        this.account = account;
        this.number = number;
    }


    public Grahak() {
    }

    public long getGrahakId() {
        return grahakId;
    }

    public void setGrahakId(long grahakId) {
        this.grahakId = grahakId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
