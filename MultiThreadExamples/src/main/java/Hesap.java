/**
 * Created by ramazan on 18.04.2017.
 */

public class Hesap {
    private double bakiye;

    public Hesap(double bakiye) {
        this.bakiye = bakiye;
    }

    synchronized public void paraCek(String paraCeken, double cekilenTutar) {
        if (cekilenTutar > this.bakiye) {
            System.out.println(paraCeken + " hesapta istenilen miktarda para yok..");
            System.out.println("Cekilmek istenen para miktari " + cekilenTutar + "\n Bakiye Tutari" + this.bakiye);
        } else {
           this.bakiye -= cekilenTutar;
            System.out.println(paraCeken + " " + cekilenTutar + " tl para Cekti.. kalan bakiye: " + this.bakiye);
        }
        System.out.println();
    }
}
