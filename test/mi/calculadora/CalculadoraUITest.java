/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class CalculadoraUITest {
    
    public CalculadoraUITest() {
    }

    /**
     * Test 0+5.
     */
    @Test
    public void testSuma1() {
        System.out.println("Probando método... suma 1");
        Operacion n = new Operacion();
        n.suma(5);
        assertEquals("Resultados",5,n.obtenerAcumulado());
  
    }
        /**
     * Test 0-7.
     */
    @Test
    public void testResta1() {
        System.out.println("Probando método... resta 1");
        Operacion n = new Operacion();
        n.resta(7);
        assertEquals("Resultados",-7,n.obtenerAcumulado());
  
    }
    /**
     * Test de 18+32.
     */
    @Test
    public void testSuma2 () {
        System.out.println("Probando método... suma 2");
        Operacion n = new Operacion();
        n.establecerAcumulado(18);
        n.suma(32);
        assertEquals("Resultados",50,n.obtenerAcumulado());
  
    }
    /**
     * Test de 27-37.
     */
    @Test
    public void testResta2 () {
        System.out.println("Probando método... resta 2");
        Operacion n = new Operacion();
        n.establecerAcumulado(27);
        n.resta(37);
        assertEquals("Resultados",-10,n.obtenerAcumulado());
    }
    /**
     * Test 0*100.
     */
    @Test
    public void testMultiplicacion1() {
        System.out.println("Probando método... multiplicación 1");
        Operacion n = new Operacion();
        n.multiplica(100);
        assertEquals("Resultados",0,n.obtenerAcumulado());
    }
     /**
     * Test 0/2.
     */
    @Test
    public void testDivision1() {
        System.out.println("Probando método... división 1");
        Operacion n = new Operacion();
        n.divide(2);
        assertEquals("Resultados",0,n.obtenerAcumulado());
    }  
     /**
     * Test 20/0.
     */
    @Test
    public void testDivision2 () {
        System.out.println("Probando método... división 2");
        Operacion n = new Operacion();
        n.establecerAcumulado(20);
        n.divide(0);
        assertEquals("Resultados",0,n.obtenerAcumulado());
    }
     /**
     * Test 40/2.
     */
     @Test
    public void testDivision3 () {
        System.out.println("Probando método... división 3");
        Operacion n = new Operacion();
        n.establecerAcumulado(40);
        n.divide(2);
        assertEquals("Resultados",20,n.obtenerAcumulado());
    } 
     /**
     * Test 330*20.
     */
     @Test
    public void testMultiplicacion2 () {
        System.out.println("Probando método... multiplicación 2");
        Operacion n = new Operacion();
        n.establecerAcumulado(333);
        n.multiplica(20);
        assertEquals("Resultados",6660,n.obtenerAcumulado());
    } 
     /**
     * Test 0-0.
     */
    @Test
    public void testResta3() {
        System.out.println("Probando método... resta 3");
        Operacion n = new Operacion();
        n.resta(0);
        assertEquals("Resultados",0,n.obtenerAcumulado());
    }
}