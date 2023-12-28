package com.yagmur.entity;

import com.yagmur.enums.Cinsiyet;

import java.util.UUID;

public class Okur {
    String id;
    String ad;
    String soyAd;
    String adres;
    String telefon;
    int yas;
    Cinsiyet cinsiyet;
    String tcKimlik;

    public Okur() {
        this.id= UUID.randomUUID().toString();
    }

    public Okur(String ad, String soyAd, String adres, String telefon, int yas, Cinsiyet cinsiyet, String tcKimlik) {
        this.id= UUID.randomUUID().toString();
        this.ad = ad;
        this.soyAd = soyAd;
        this.adres = adres;
        this.telefon = telefon;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.tcKimlik = tcKimlik;
    }

    @Override
    public String toString() {
        return "Okur{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }
}
