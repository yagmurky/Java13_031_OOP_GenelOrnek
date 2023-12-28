package com.yagmur.entity;

import java.util.Random;
import java.util.UUID;

public class Kitap {
    String id;
    String kitapAdi;
    int basimYili;
    int sayfaSayisi;
    int stokAdedi;
    String yazar;
    String aciklama;
    String tercuman;
    String yayinEvi;
    Konum konum;

    public Kitap() {
        this.id= UUID.randomUUID().toString();
    }

    public Kitap(String kitapAdi, int basimYili, int sayfaSayisi,
                 int stokAdedi, String yazar, String aciklama, String tercuman, String yayinEvi) {
        this.id= UUID.randomUUID().toString();
        this.kitapAdi = kitapAdi;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
        this.stokAdedi = stokAdedi;
        this.yazar = yazar;
        this.aciklama = aciklama;
        this.tercuman = tercuman;
        this.yayinEvi = yayinEvi;
    }


    public Kitap(String kitapAdi, int basimYili, int sayfaSayisi, int stokAdedi, String yazar, String aciklama,
                 String tercuman, String yayinEvi, Konum konum) {
        this.id= UUID.randomUUID().toString();
        this.kitapAdi = kitapAdi;
        this.basimYili = basimYili;
        this.sayfaSayisi = sayfaSayisi;
        this.stokAdedi = stokAdedi;
        this.yazar = yazar;
        this.aciklama = aciklama;
        this.tercuman = tercuman;
        this.yayinEvi = yayinEvi;
        this.konum = konum;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "id='" + id + '\'' +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", basimYili=" + basimYili +
                ", sayfaSayisi=" + sayfaSayisi +
                ", stokAdedi=" + stokAdedi +
                ", yazar='" + yazar + '\'' +
                ", aciklama='" + aciklama + '\'' +
                ", tercuman='" + tercuman + '\'' +
                ", yayinEvi='" + yayinEvi + '\'' +
                ", konum=" + konum +
                '}';
    }

    public Konum getKonum() {
        return konum;
    }

    public void setKonum(Konum konum) {
        this.konum = konum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(int basimYili) {
        this.basimYili = basimYili;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getTercuman() {
        return tercuman;
    }

    public void setTercuman(String tercuman) {
        this.tercuman = tercuman;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }
}
