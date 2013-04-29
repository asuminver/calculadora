/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.calculadora;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Miguel Castillo
 */
public class OperacionTest {
    
    Operacion oper;
    
    @Before
    public void iniciar() {
        oper = new Operacion();
    }
    // Inicializa la operacion
    

    @Test
    public void testSuma1() {
        System.out.println("probando metodo.....suma1");
        int a=0;
        int b=5;
        oper.establecerAcumulado(a);
        oper.suma(b);
        int result=oper.obtenerAcumulado();
        assertEquals(a+b, result);
    }

    
   @Test
    public void testresta1() {
        System.out.println("probando metodo...resta1");
        int a = 0;
        int b = 7;
        oper.establecerAcumulado(a);
        oper.resta(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a - b, result);
        
    }
   
   @Test
    public void testsuma2() {
        System.out.println("probando metodo.....suma2");
        int a = 18;
        int b = 32;
        oper.establecerAcumulado(a);
        oper.suma(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a+b, result);
    }
   
   @Test
    //27-37
    public void testresta2() {
        System.out.println("probando metodo.....resta2");
        int a = 27;
        int b = 37;
        oper.establecerAcumulado(a);
        oper.resta(b);
        int result=oper.obtenerAcumulado();
        assertEquals(a-b, result);
    }

    @Test
    public void testmultiplica1() {
        System.out.println("probando metodo.....multiplica1");
        int a = 0;
        int b = 100;
        oper.establecerAcumulado(a);
        oper.multiplica(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a * b, result);
    }
   
     @Test
    public void testdivide1() {
        System.out.println("probando metodo.....divide1");
        int a = 0;
        int b = 2;
        oper.establecerAcumulado(a);
        oper.divide(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a / b, result);
    }

     @Test
    public void testdivide2() {
        System.out.println("probando metodo.....divide2");
        int a = 20;
        int b = 0;
        oper.establecerAcumulado(a);
        oper.divide(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a / b, result);
    }
     
    @Test
    public void testdivide3() {
        System.out.println("probando metodo.....divide3");
        int a = 40;
        int b = 2;
        oper.establecerAcumulado(a);
        oper.divide(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a / b, result);
    }

    @Test
    public void testmultiplica2() {
        System.out.println("probando metodo.....multiplica2");
        int a = 333;
        int b = 20;
        oper.establecerAcumulado(a);
        oper.multiplica(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a * b, result);
    }

    @Test
    public void testresta3() {
        System.out.println("probando metodo.....resta3");
        int a = 0;
        int b = 0;
        oper.establecerAcumulado(a);
        oper.resta(b);
        int result = oper.obtenerAcumulado();
        assertEquals(a - b, result);
    }
}
