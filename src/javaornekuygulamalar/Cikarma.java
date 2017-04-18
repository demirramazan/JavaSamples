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
public class Cikarma extends DortIslem {

    @Override
    public int hesaplama() {
        return Math.abs(getSayi1() - getSayi2());
    }

}
