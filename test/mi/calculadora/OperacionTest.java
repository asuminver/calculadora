
package mi.calculadora;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



/**
 *
 * @author Miguel Angel López Harillo
 */
public class OperacionTest {
        
    /** public OperacionTest() {
    } */
    
    Operacion Topera;
    
  @Before
    public void inicializar() { // creamos la variable
        Topera = new Operacion();
    }
    
    /** @AfterClass
    public static void tearDownClass() {
    } */    

    /**
     * Test of suma method, of class Operacion.
     */
    
    @Test // 0+5
    public void testSuma05() { 
        System.out.println("Estamos probando la suma de 0 y 5  --- testSuma05");
        int a=0;
        int b=5;
        Topera.establecerAcumulado(a);
        Topera.suma(b);
        int result=Topera.obtenerAcumulado();
        assertEquals(a + b, result);
    }
    
    
    /**
     * Test of resta method, of class Operacion.
     */
    
    @Test // 0-7
    public void testResta07() {
        System.out.println("Estamos probando la resta de 0 y 7  --- testResta07");
        int a = 0;
        int b = 7;
        Topera.establecerAcumulado(a);
        Topera.resta(b);
        int result = Topera.obtenerAcumulado();
        assertEquals(a-b, result);
    }
    
    
    @Test // 18+32
    public void testSuma1832() { 
        System.out.println("Estamos probando la suma de 18 y 32  --- testSuma1832");
        int a=18;
        int b=32;
        Topera.establecerAcumulado(a);
        Topera.suma(b);
        int result=Topera.obtenerAcumulado();
        assertEquals(a + b, result);
    }
    
    @Test // 27-37
    public void testResta2737() {
        System.out.println("Estamos probando la resta de 27 y 37  --- testResta2737");
        int a = 27;
        int b = 37;
        Topera.establecerAcumulado(a);
        Topera.resta(b);
        int result = Topera.obtenerAcumulado();
        assertEquals(a-b, result);
    }
    
    
    
    /**
     * Test of multiplica method, of class Operacion.
     */
           
    @Test // 0*100
    public void testMultiplica0100() {
        System.out.println("Estamos probando la multiplicación de 0 * 100  --- testMultiplica0100");
        int a=0;
        int b=100;
        Topera.establecerAcumulado(a);
        Topera.multiplica(b);
        int result = Topera.obtenerAcumulado();
        assertEquals(a* b, result);
    }
    
    /**
     * Test of divide method, of class Operacion.
     */
    
    @Test // 0/2
    public void testDivide02() {
        System.out.println("Estamos probando la división de 0 / 2  --- testDivide02");
        int a=0;
        int b=2;
        Topera.establecerAcumulado(a);
        Topera.divide(b);
        int result= Topera.obtenerAcumulado();
        assertEquals(a/b, result);
    }
    
   @Test // 20/0
    public void testDivide200() {
        System.out.println("Estamos probando la división de 20 / 0  --- testDivide200");
        int a=20;
        int b=0;
        Topera.establecerAcumulado(a);
        Topera.divide(b);
        int result= Topera.obtenerAcumulado();
        assertEquals(a/b, result);
    } 
   
   @Test // 40/2
    public void testDivide402() {
        System.out.println("Estamos probando la división de 40 / 2  --- testDivide402");
        int a=40;
        int b=2;
        Topera.establecerAcumulado(a);
        Topera.divide(b);
        int result= Topera.obtenerAcumulado();
        assertEquals(a/b, result);
    } 
   
    @Test // 333*20
    public void testMultiplica33320() {
        System.out.println("Estamos probando la multiplicación de 333 * 20  --- testMultiplica33320");
        int a=333;
        int b=20;
        Topera.establecerAcumulado(a);
        Topera.multiplica(b);
        int result = Topera.obtenerAcumulado();
        assertEquals(a* b, result);
    }
    
    
    @Test // 0-0
    public void testResta00() {
        System.out.println("Estamos probando la resta de 0 y 0  --- testResta00");
        int a = 0;
        int b = 0;
        Topera.establecerAcumulado(a);
        Topera.resta(b);
        int result = Topera.obtenerAcumulado();
        assertEquals(a-b, result);
    }
    
    
    /**
     * Test of obtenerAcumulado method, of class Operacion.
     */
    /** @Test
    public void testObtenerAcumulado() {
        System.out.println("obtenerAcumulado");
        Operacion instance = new Operacion();
        int expResult = 0;
        int result = instance.obtenerAcumulado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of mostrarAcumulado method, of class Operacion.
     */
    /** @Test
    public void testMostrarAcumulado() {
        System.out.println("mostrarAcumulado");
        Operacion instance = new Operacion();
        String expResult = "";
        String result = instance.mostrarAcumulado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of borrarAcumulado method, of class Operacion.
     */
    /** @Test
    public void testBorrarAcumulado() {
        System.out.println("borrarAcumulado");
        Operacion instance = new Operacion();
        instance.borrarAcumulado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of establecerAcumulado method, of class Operacion.
     */
    /**@Test
    public void testEstablecerAcumulado() {
        System.out.println("establecerAcumulado");
        int v = 0;
        Operacion instance = new Operacion();
        instance.establecerAcumulado(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
