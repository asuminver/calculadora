package mi.calculadora;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Mami
 */
public class OperacionTest {
    
    Operacion o;
    
    @Before
    public void prepare() {
        o = new Operacion();
    }
    /* He creado un método preparación que se ejecutará antes de cada método de 
     * de prueba. 
     */
    
    
    @Test
    //0+5
    public void testsuma() {
        int n1 = 0;
        int n2 = 5;
        o.establecerAcumulado(n1);

        o.suma(n2);
        int resultado = o.obtenerAcumulado();
        
        assertEquals(n1+n2, resultado);
        //assertEquals(5, resultado);
    }
    @Test
    //0-7
    public void testresta() {
        int n1 = 0;
        int n2 = 7;
        o.establecerAcumulado(n1);

        o.resta(n2);
        int resultado = o.obtenerAcumulado();
        
        assertEquals(n1-n2, resultado);
        //assertEquals(7, resultado);
    }
    
    @Test
    //18+32
    public void testsuma2() {
    int n1 = 18;
    int n2 = 32;
    o.establecerAcumulado(n1);
    
    o.suma(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1+n2, resultado);
    }
    
    @Test
    //27-37
    public void testresta2() {
    int n1 = 27;
    int n2 = 37;
    o.establecerAcumulado(n1);
    
    o.resta(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1-n2, resultado);            
    }
    
    @Test
    //0*100
    public void testmultiplica(){
    int n1 = 0;
    int n2 = 100;
    o.establecerAcumulado(n1);
    
    o.multiplica(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1*n2, resultado);
    }
    
    @Test
    //0/2
    public void testdivide(){
    int n1 = 0;
    int n2 = 2;
    o.establecerAcumulado(n1);
    
    o.divide(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1/n2, resultado);
    }
   
    @Test
    //20/0
    public void testdivide2(){
    int n1 = 20;
    int n2 = 0;
    o.establecerAcumulado(n1);
    
    o.divide(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1/n2, resultado);
    }
    
    @Test
    //40/2
    public void testdivide3(){
    int n1 = 40;
    int n2 = 2;
    o.establecerAcumulado(n1);
    
    o.divide(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1/n2, resultado);
    }
    
    @Test
    //333*20
    public void testmultiplica2(){
    int n1 = 333;
    int n2 = 20;
    o.establecerAcumulado(n1);
    
    o.multiplica(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1*n2, resultado);
    }
    
    @Test
    //0-0
    public void testresta3(){
    int n1 = 0;
    int n2 = 0;
    o.establecerAcumulado(n1);
    
    o.resta(n2);
    int resultado = o.obtenerAcumulado();
    
    assertEquals(n1-n2, resultado);  
    }
}
