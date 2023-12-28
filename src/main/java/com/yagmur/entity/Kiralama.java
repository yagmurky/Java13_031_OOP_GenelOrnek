package com.yagmur.entity;

import com.yagmur.enums.KitapTuru;
import com.yagmur.enums.State;

import java.util.Date;
import java.util.UUID;

public class Kiralama {
    String id;
    Kitap kitap;
    Okur okur;
    Date kiralamaTarihi;
    int kiralamaSuresi;
    Date iadeTarihi;
    Date gecIadeTarihi;
    State state;


    public Kiralama() {
    }

    public Kiralama(Kitap kitap, Okur okur, Date kiralamaTarihi, int kiralamaSuresi, Date iadeTarihi, Date gecIadeTarihi, State state) {
        this.id= UUID.randomUUID().toString();
        this.kitap = kitap;
        this.okur = okur;
        this.kiralamaTarihi = kiralamaTarihi;
        this.kiralamaSuresi = kiralamaSuresi;
        this.iadeTarihi = iadeTarihi;
        this.gecIadeTarihi = gecIadeTarihi;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Kiralama{" +
                "id='" + id + '\'' +
                ", kitap=" + kitap +
                ", okur=" + okur +
                ", kiralamaTarihi=" + kiralamaTarihi +
                ", kiralamaSuresi=" + kiralamaSuresi +
                ", iadeTarihi=" + iadeTarihi +
                ", gecIadeTarihi=" + gecIadeTarihi +
                ", state=" + state +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public Okur getOkur() {
        return okur;
    }

    public void setOkur(Okur okur) {
        this.okur = okur;
    }

    public Date getKiralamaTarihi() {
        return kiralamaTarihi;
    }

    public void setKiralamaTarihi(Date kiralamaTarihi) {
        this.kiralamaTarihi = kiralamaTarihi;
    }

    public int getKiralamaSuresi() {
        return kiralamaSuresi;
    }

    public void setKiralamaSuresi(int kiralamaSuresi) {
        this.kiralamaSuresi = kiralamaSuresi;
    }

    public Date getIadeTarihi() {
        return iadeTarihi;
    }

    public void setIadeTarihi(Date iadeTarihi) {
        this.iadeTarihi = iadeTarihi;
    }

    public Date getGecIadeTarihi() {
        return gecIadeTarihi;
    }

    public void setGecIadeTarihi(Date gecIadeTarihi) {
        this.gecIadeTarihi = gecIadeTarihi;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
