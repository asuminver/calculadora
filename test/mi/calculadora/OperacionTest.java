
package mi.calculadora;
import mi.calculadora.Operacion;
import mi.calculadora.Operacion;
import static org.testng.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Beatiz Caracena Rives
 * @version 1.0
 * NOTA-> este es mi test bueno
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
       Operacion op;
     /**
      * Sobreescribo el método Before para que me cree un nuevo objeto de la clase
      * Operacion para que se ejecute antes de cada test
      */
     @Before
     public void creacionClase() {
     op= new Operacion();
     }
     //A continuación voy hacer un test para cada clase, para comprobar que funciona
     //correctamente con los valores pasados en el ejercicio
     //Test para la suma 0+5
     @Test
     public void testSuma1(){
         int n1=0;
         int n2=5;
         this.op.establecerAcumulado(n1);
         this.op.suma(n2);
         assertEquals(n1+n2,this.op.obtenerAcumulado());
     }
     //Test para la resta 0-7
     @Test
     public void testResta1(){
        int n1=0;
        int n2=7;
        this.op.establecerAcumulado(n1);
        this.op.resta(n2);
        assertEquals(n1+n2,this.op.obtenerAcumulado());
     }
     //Test para la suma 18+32
     @Test
     public void testSuma2(){
         int n1=18;
         int n2=32;
         this.op.establecerAcumulado(n1);
         this.op.suma(n2);
         assertEquals(n1+n2,this.op.obtenerAcumulado());
     }
     //Test para la resta 27-37
     @Test
     public void testResta2(){
        int n1=27;
        int n2=37;
        this.op.establecerAcumulado(n1);
        this.op.resta(n2);
        assertEquals(n1+n2,this.op.obtenerAcumulado());
     }
     //test para la multiplicacion 0*100
     @Test
     public void testMultiplica1(){
        int n1=0;
        int n2=100;
        this.op.establecerAcumulado(n1);
        this.op.multiplica(n2);
        assertEquals(n1+n2,this.op.obtenerAcumulado());
     }
     //Test para la division 0/2
     @Test
     public void testDivide1(){
         int n1=0;
         int n2=2; 
         this.op.establecerAcumulado(n1);
         this.op.divide(n2);
         assertEquals(n1+n2,this.op.obtenerAcumulado()); 
     }
     //Test para la division 20/0
     @Test
     public void testDivide2(){
         int n1=20;
         int n2=0; 
         this.op.establecerAcumulado(n1);
         this.op.divide(n2);
         assertEquals(n1+n2,this.op.obtenerAcumulado()); 
     }
     //test para la division 40/2
     @Test
     public void testDivide3(){
         int n1=40;
         int n2=2; 
         this.op.establecerAcumulado(n1);
         this.op.divide(n2);
         assertEquals(n1+n2,this.op.obtenerAcumulado()); 
     }
     //Test para la multiplicacion 333*20
     @Test
     public void testMultiplica(){
         int n1=333;
         int n2=20; 
         this.op.establecerAcumulado(n1);
         this.op.divide(n2);
         assertEquals(n1+n2,this.op.obtenerAcumulado()); 
     }
     //Test para la resta 0-0
     @Test
     public void testResta3(){
        int n1=0;
        int n2=0;
        this.op.establecerAcumulado(n1);
        this.op.resta(n2);
        assertEquals(n1+n2,this.op.obtenerAcumulado());
     }
}

