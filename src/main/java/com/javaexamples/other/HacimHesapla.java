/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexamples.other;

/**
 *
 * @author ramazan
 */
public class HacimHesapla {
    double genislik;
    double yukseklik;
    double derinlik;

    public HacimHesapla(double genislik, double yukseklik, double derinlik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.derinlik = derinlik;
    }
    public double hacimhesapla(){
        return genislik*yukseklik*derinlik;
    }
    public static void main(String[] args) {
        HacimHesapla hacimHesapla=new HacimHesapla(10, 20, 30);
        double hacim=hacimHesapla.hacimhesapla();
        System.out.println("Hacim : "+hacim +" metrekup");
    }
    
}
