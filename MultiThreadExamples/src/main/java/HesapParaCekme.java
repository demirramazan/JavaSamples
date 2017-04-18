/**
 * Created by ramazan on 18.04.2017.
 */
public class HesapParaCekme implements Runnable {
    private Hesap hesap;
    private String paraCeken;
    private double cekilenTutar;

    public HesapParaCekme(Hesap hesap, String paraCeken, double cekilenTutar) {
        this.hesap = hesap;
        this.paraCeken = paraCeken;
        this.cekilenTutar = cekilenTutar;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hesap.paraCek(paraCeken, cekilenTutar);
    }

    public static void main(String[] args) {
        Hesap hesap = new Hesap(1000);
        Thread t1 = new Thread(new HesapParaCekme(hesap, "Ahmet", 300));
        Thread t2 = new Thread(new HesapParaCekme(hesap, "Mehmet", 500));
        Thread t3 = new Thread(new HesapParaCekme(hesap, "Ali", 900));
        t1.start();
        t2.start();
        t3.start();
    }
    /*Ali 900.0 tl para Cekti.. kalan bakiye: 100.0

    Mehmet hesapta istenilen miktarda para yok..
    Cekilmek istenen para miktari 500.0
    Bakiye Tutari100.0

    Ahmet hesapta istenilen miktarda para yok..
    Cekilmek istenen para miktari 300.0
    Bakiye Tutari100.0*/
}
