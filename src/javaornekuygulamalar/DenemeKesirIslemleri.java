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
public class DenemeKesirIslemleri {
    public static void main(String[] args) {
        Kesir k=new Kesir(4, 10);
        Kesir k1=new Kesir(5, 6);
        k.topla(k1);
      System.out.println("Toplam :" +k.pay+"/"+k.payda);
      //  System.out.println(21%23);
    }
    
}
