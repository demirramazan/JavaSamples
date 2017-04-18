
package javaornekuygulamalar;

import javaornekuygulamalar.Cikarma;
import org.junit.*;

import static org.junit.Assert.*;

/**
 *
 * @author ramazan
 */
public class DortIslemTest {

    public DortIslemTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of hesaplama method, of class Cikarma.
     */
    @Test
    public void testCikarma() {
        System.out.println("Cikarma hesaplama");
        Cikarma instance = new Cikarma();
        instance.setSayi1(15);
        instance.setSayi2(5);
        int expResult = 10;
        int result = instance.hesaplama();
        assertEquals(expResult, result);
        System.out.println("Beklenen Sonuc: " + expResult + " \tCikan Sonuc" + result);
    }

    @Test
    public void testCarpma() {
        System.out.println("Carpma Hesaplama Test");
        Carpma carpma = new Carpma();
        carpma.setSayi1(10);
        carpma.setSayi2(5);
        int result = carpma.hesaplama();
        int expResult = 50;
        assertEquals(expResult, result);
        System.out.println("Beklenen Sonuc: " + expResult + " \tCikan Sonuc" + result);
    }

    @Test
    public void testToplama() {
        System.out.println("Toplama Hesaplama Test");
        Toplama toplama = new Toplama();
        toplama.setSayi1(10);
        toplama.setSayi2(5);
        int result = toplama.hesaplama();
        int expResult = 15;
        assertEquals(expResult, result);
        System.out.println("Beklenen Sonuc: " + expResult + " \tCikan Sonuc" + result);
    }

    @Test
    public void testBolme() {
        System.out.println("Bolme Hesaplama Test");
        Bolme bolme = new Bolme();
        bolme.setSayi1(10);
        bolme.setSayi2(5);
        int result = bolme.hesaplama();
        int expResult = 2;
        assertEquals(expResult, result);
        System.out.println("Beklenen Sonuc: " + expResult + " \tCikan Sonuc" + result);
    }

}
