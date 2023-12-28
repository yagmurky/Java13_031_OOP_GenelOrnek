package com.yagmur.repository;

import com.yagmur.Database.KutuphaneDB;
import com.yagmur.entity.Kitap;

/**
 * DİKKAT BUNU HATIRLAYIN!!!
 *
 */
import static com.yagmur.Database.KutuphaneDB.*;

public class KitapRepository {
    /**
     * Kendisine ait olan entitynin istiflenmesi ve gerekli olduğybda bilgilerinin çekilmesi işlemlerini yapar.
     * create
     * read
     * update
     * delete
     */

    public void save(Kitap kitap){
        kitapListesi[kitapSayisi++]=kitap;
    }

    public Kitap findByAd(String kitapAdi){
        for (Kitap kitap: kitapListesi){
            if (kitap.getKitapAdi().contains(kitapAdi))
                return kitap;
        }return null;
    }

    public Kitap[] findAll(){
        Kitap[] result=new Kitap[kitapSayisi];
        for (int i=0; i<kitapSayisi;i++)
            result[i]=kitapListesi[i];
        return result;


    }
}
