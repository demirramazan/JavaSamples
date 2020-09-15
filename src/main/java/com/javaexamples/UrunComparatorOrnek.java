/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ramazan
 */
public class UrunComparatorOrnek {
    
    public static void main(String[] args) {
        Urun urun1 = new Urun(240, "ayakkabi1", 150);
        Urun urun2 = new Urun(140, "giysi1", 40);
        Urun urun3 = new Urun(555, "ayakkabi2", 80);
        Urun urun4 = new Urun(180, "pantolon1", 100);
        Urun urun5 = new Urun(30, "giysi2", 90);
        Urun urun6 = new Urun(170, "pantolon2", 300);
        
        ArrayList<Urun> uruns = new ArrayList<Urun>();
        uruns.add(urun1);
        uruns.add(urun2);
        uruns.add(urun3);
        uruns.add(urun4);
        uruns.add(urun5);
        uruns.add(urun6);
        
        System.out.println("Fiyata Göre Sıralama");
        
        Collections.sort(uruns, new Comparator<Urun>() {
            @Override
            public int compare(Urun o1, Urun o2) {
                return new Integer(o1.getFiyat()).compareTo(o2.getFiyat());
            }
            
        });
        for (Urun urun : uruns) {
            System.out.println(urun);
        }
        
    }
}
