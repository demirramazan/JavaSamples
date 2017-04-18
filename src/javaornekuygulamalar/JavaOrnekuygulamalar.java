/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaornekuygulamalar;

import java.util.Scanner;

/**
 *
 * @author ramazan
 */
public class JavaOrnekuygulamalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Pay ve Payda yi giriniz: ");
        int pay=s.nextInt();
        int payda=s.nextInt();
       int kesirToplam = getKesirToplam(pay,payda);
        System.out.println((pay/payda)+" Kesir toplami:"+ kesirToplam);
    }

    private static int getKesirToplam(int pay, int payda) {
        int toplam = 0;
        try {
            if (payda==0) {
                System.out.println("payda sifir olamaz");
            }
            toplam= pay+payda;
        } catch (ArithmeticException e) {
            System.err.println("");
        }
        return toplam;
   
    }
    
}
