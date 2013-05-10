/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio Domingo Balaguer Nicolas
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
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Operacion.
     */
    @Test
    public void testSuma1() {
        System.out.println("Test con suma: 0+5");
        Operacion op = new Operacion();
        op.establecerAcumulado(0);
        op.suma(5);
        assertEquals(5, op.obtenerAcumulado());
    }
    
    @Test
    public void testSuma2() {
        System.out.println("Test con suma: 18+32");
        Operacion op = new Operacion();
        op.establecerAcumulado(18);
        op.suma(32);
        assertEquals(50, op.obtenerAcumulado());
    }
        
        
    

    /**
     * Test of resta method, of class Operacion.
     */
    @Test
    public void testResta() {
        System.out.println("Test con resta: 0-7");
        Operacion op = new Operacion();
        op.establecerAcumulado(0);
        op.resta(7);
        assertEquals(-7, op.obtenerAcumulado());
     }
    
    @Test
    public void testResta2(){
        System.out.println("Test con resta: 27-37");
        Operacion op = new Operacion();
        op.establecerAcumulado(27);
        op.resta(37);
        assertEquals(-10, op.obtenerAcumulado());
    }

    @Test
    public void testResta3(){
        System.out.println("Test con resta: 0-0");
        Operacion op = new Operacion();
        op.establecerAcumulado(0);
        op.resta(0);
        assertEquals(0, op.obtenerAcumulado());
    }
    
    /**
     * Test of multiplica method, of class Operacion.
     */
    @Test
    public void testMultiplica1() {
        System.out.println("Test con multiplicación: 0*100");
        Operacion op = new Operacion();
        op.establecerAcumulado(0);
        op.multiplica(100);
        assertEquals(0, op.obtenerAcumulado());
    }
    
    @Test
    public void testMultiplica2(){
        System.out.println("Test con multiplicación: 333*20");
        Operacion op = new Operacion();
        op.establecerAcumulado(333);
        op.multiplica(20);
        assertEquals(6660, op.obtenerAcumulado());
    }

    /**
     * Test of divide method, of class Operacion.
     */
    @Test
    public void testDivide1() {
        System.out.println("Test con división: 0/2");
        Operacion op = new Operacion();
        op.establecerAcumulado(0);
        op.divide(2);
        assertEquals(0, op.obtenerAcumulado());
    } 
    
    @Test
    public void testDivide2() {
        System.out.println("Test con división: 20/0");
        Operacion op = new Operacion();
        op.establecerAcumulado(20);
        op.divide(0);
        assertEquals(0, op.obtenerAcumulado());
    }
    
    @Test
    public void testDivide3() {
        System.out.println("Test con división: 40/20");
        Operacion op = new Operacion();
        op.establecerAcumulado(40);
        op.divide(2);
        assertEquals(20, op.obtenerAcumulado());
    }   
        
     /**
     * Test of obtenerAcumulado method, of class Operacion.
     */
    @Test
    public void testObtenerAcumulado() {
        System.out.println("obtenerAcumulado");
        Operacion instance = new Operacion();
        int expResult = 0;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of mostrarAcumulado method, of class Operacion.
     */
    @Test
    public void testMostrarAcumulado() {
        System.out.println("mostrarAcumulado");
        Operacion instance = new Operacion();
        String expResult = "";
        String result = instance.mostrarAcumulado();
        assertTrue(!expResult.equals(result));
        
    }

    /**
     * Test of borrarAcumulado method, of class Operacion.
     */
    @Test
    public void testBorrarAcumulado() {
        System.out.println("borrarAcumulado");
        Operacion instance = new Operacion();
        instance.borrarAcumulado();
        
    }

    /**
     * Test of establecerAcumulado method, of class Operacion.
     */
    @Test
    public void testEstablecerAcumulado() {
        System.out.println("establecerAcumulado");
        int v = 0;
        Operacion instance = new Operacion();
        instance.establecerAcumulado(v);
        
    }
}
