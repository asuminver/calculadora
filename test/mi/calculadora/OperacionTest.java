package mi.calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Prática Tema 10: Pruebas JUnit.
 * @version 1.0, 06/03/13
 * @author David Soler Vicente
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test del método suma con valores 0 y 5, resultado 5.
     */
    @Test
    public void testSuma1() {
        System.out.println("Probamos la suma 0+5");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(0);
        int s = 5;
        int expResult = 5;
        instance.suma(s);
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }

    /**
     * Test del método resta con valores 0 y 7, resultado -7.
     */
    @Test
    public void testResta1() {
        System.out.println("Probamos la resta 0-7");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(0);
        int r = 7;
        int expResult = -7;
        instance.resta(r);
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }
    
    /**
     * Test del método suma con valores 18 y 32, resultado 50.
     */
    public void testSuma2() {
        System.out.println("Probamos la suma 18+32");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(18);
        int s = 32;
        int expResult = 50;
        instance.suma(s);
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }

    /**
     * Test del método resta con valores 27 y 37, resultado -10.
     */ 
    @Test
    public void testResta2() {
        System.out.println("Probamos la resta 27-37");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(27);
        int r = 37;
        int expResult = -10;
        instance.resta(r);
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }

    /**
     * Test del método multiplica con valores 0 y 100, resultado 0.
     */
    @Test
    public void testMultiplica1() {
        System.out.println("Probamos la multiplicación 0*100");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(0);
        int m = 100;
        instance.multiplica(m);
        int expResult = 0;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }

    /**
     * Test del método divide con valores 40 y 2, resultado 20.
     */
    @Test
    public void testDivide1() {
        System.out.println("Probamos la división 40/2");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(40);
        int d = 2;
        instance.divide(d);
        int expResult = 20;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }
    /**
     * Test del método divide con valores 0 y 2, resultado 0.
     */
    @Test
    public void testDivide2() {
        System.out.println("Probamos la división 0/2");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(0);
        int d = 2;
        instance.divide(d);
        int expResult = 0;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }
    /**
     * Test del método divide con valores 20 y 0, resultado 0.
     * Podría existir un problema al dividir entre 0, pero ya está resulto en el 
     * método al recojer la excepción y devolver el valor 0.
     */
    @Test
    public void testDivide3() {
        System.out.println("Probamos la división 20/0");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(20);
        int d = 0;
        instance.divide(d);
        int expResult = 0;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }
     /**
     * Test del método multiplica con valores 330 y 20, resultado 6600.
     */
    @Test
    public void testMultiplica2() {
        System.out.println("Probamos la división 330*20");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(330);
        int m = 20;
        instance.multiplica(m);
        int expResult = 6600;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }
    /**
     * Test del método resta con valores 0 y 0, resuladdo 0.
     */
    @Test
    public void testResta3() {
        System.out.println("Probamos la resta 0-0");
        Operacion instance = new Operacion();
        instance.establecerAcumulado(0);
        int r = 0;
        int expResult = 0;
        instance.resta(r);
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
    }
}