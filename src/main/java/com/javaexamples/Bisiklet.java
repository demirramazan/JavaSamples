/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexamples;

/**
 *
 * @author ramazan
 */
public class Bisiklet {
    int hiz;
    int agirlik;
    int vites;
    public Bisiklet(int a){
        hiz =0;
        vites=1;
        agirlik=a;
    }
    public void hizDegistir(int yeniHiz){
        hiz=yeniHiz;
    }
    public void vitesArttir(){
        vites++;
    }
    public void vitesAzalt(){
        vites--;
    }
    public void hizGoster(){
        System.out.println("Hizimiz: "+ hiz);
        System.out.println("Vitesimiz: "+ vites);
    }
    public static void main(String[] args) {
        Bisiklet b=new Bisiklet(10);
        b.hiz=10;
        b.hizDegistir(20);
        b.hizGoster();
        b.vitesArttir();
        b.vitesArttir();
        b.hizGoster();
        b.vites=4;
        b.hizDegistir(110);
        b.vitesArttir();
        b.hizGoster();
    }
}
