package mi.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void suma1Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(0);
		v.suma(5);
		assertEquals(5, v.obtenerAcumulado());	
	}
	
	@Test 
	public void suma2Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(18);
		v.suma(32);
		assertEquals(50, v.obtenerAcumulado());
		
	}
	
	@Test
	public void resta1Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(0);
		v.resta(7);
		assertEquals(-7, v.obtenerAcumulado());	
	}
	
	@Test
	public void resta2Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(27);
		v.resta(37);
		assertEquals(-10, v.obtenerAcumulado());	
	}
	
	@Test
	public void resta3Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(0);
		v.resta(0);
		assertEquals(0, v.obtenerAcumulado());	
	}
	
	@Test
	public void multiplicacion1Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(0);
		v.multiplica(100);
		assertEquals(0, v.obtenerAcumulado());
	}
	
	@Test
	public void multiplicacion2Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(333);
		v.multiplica(20);
		assertEquals(6660, v.obtenerAcumulado());
	}
	
	@Test
	public void division1Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(0);
		v.divide(2);
		assertEquals(0, v.obtenerAcumulado());
	}
	
	@Test
	public void division2Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(20);
		v.divide(0);
		assertEquals(0, v.obtenerAcumulado());
	}
	
	@Test
	public void division3Test(){
		Operacion v = new Operacion();
		v.establecerAcumulado(40);
		v.divide(2);
		assertEquals(20, v.obtenerAcumulado());
	}
	
	

}
