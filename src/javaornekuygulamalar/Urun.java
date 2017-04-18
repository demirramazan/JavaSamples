/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekuygulamalar;

/**
 *
 * @author ramazan
 */
public class Urun {

    private int id;
    private String urunAdi;
    private int fiyat;

    public Urun(int id, String urunAdi, int fiyat) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", urunAdi=" + urunAdi + ", fiyat=" + fiyat ;
    }

}
