package mi.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Tema 10.JUnit.
 * @version 12/03/13
 * @author Inma Tortosa
 */

public class OperacionTest {
	@Test
	public void testSuma1() { //código del test 0+5=5
		Operacion n = new Operacion();
		n.suma(5);
		assertEquals("Resultado", 5, n.obtenerAcumulado());
	}
	
	@Test
	public void testSuma2() { //código del test 18+32=50
		Operacion n = new Operacion();
		n.establecerAcumulado(18);
		n.suma(32);
		assertEquals("Resultado", 50, n.obtenerAcumulado());
	}
	
	@Test
	public void testResta1() { //código del test 0-7=-7
		Operacion n = new Operacion();
		n.resta(7);
		assertEquals("Resultado", -7, n.obtenerAcumulado());
	}
	
	@Test
	public void testResta2() { //código del test 27-37=-10
		Operacion n = new Operacion();
		n.establecerAcumulado(27);
		n.resta(37);
		assertEquals("Resultado", -10, n.obtenerAcumulado());
	}
	
	@Test
	public void testResta3() { //código del test 0-0=0
		Operacion n = new Operacion();
		n.resta(0);
		assertEquals("Resultado", 0, n.obtenerAcumulado());
	}

	@Test
	public void testMultiplica1() { //código del test 0*100=0
		Operacion n = new Operacion();
		n.multiplica(100);
		assertEquals("Resultado", 0, n.obtenerAcumulado());
	}
	
	@Test
	public void testMultiplica2() { //código del test 333*20=6660
		Operacion n = new Operacion();
		n.establecerAcumulado(333);
		n.multiplica(20);
		assertEquals("Resultado", 6660, n.obtenerAcumulado());
	}
	
	@Test
	public void testDivide1() { //código del test 0/2=0
		Operacion n = new Operacion();
		n.divide(2);
		assertEquals("Resultado", 0, n.obtenerAcumulado());
	}
	
	@Test
	public void testDivide2() { //código del test 20/0
		Operacion n = new Operacion();
		n.establecerAcumulado(20);
		n.divide(0);
		assertEquals("Resultado", 0, n.obtenerAcumulado()); //de acuerdo a lo indicado en la clase Operacion, la división entre 0 da 0. 
	}
	
	@Test
	public void testDivide3() { //código del test 40/2=20
		Operacion n = new Operacion();
		n.establecerAcumulado(40);
		n.divide(2);
		assertEquals("Resultado", 20, n.obtenerAcumulado()); 
	}
}



