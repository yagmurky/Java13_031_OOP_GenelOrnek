package com.yagmur.entity;

import com.yagmur.enums.Cinsiyet;

import java.util.UUID;

public class Yazar {

    String id;
    String ad;
    String soyAd;
    String hakkinda;
    Cinsiyet cinsiyet;
    int yas;


    public Yazar() {
        this.id= UUID.randomUUID().toString();
    }

    public Yazar(String ad, String soyAd, String hakkinda, Cinsiyet cinsiyet, int yas) {
        this.id= UUID.randomUUID().toString();
        this.ad = ad;
        this.soyAd = soyAd;
        this.hakkinda = hakkinda;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
    }

    @Override
    public String toString() {

        return "Yazar{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", hakkinda='" + hakkinda + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", yas=" + yas +
                '}';
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        this.hakkinda = hakkinda;
    }
}
