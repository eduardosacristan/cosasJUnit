package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {

	private static Calculadora calc;
	
	@BeforeClass // Crea la clase para todos los tests, en caso de que sea una clase lenta de instanciar por ejemplo
	public static void beforeClass() {
		System.out.println("Before class()");
		calc = new Calculadora();
	}
	
	@Before //Ejecuta este código antes de cada uno de los tests
	public void before() {
		System.out.println("Before()");
		calc.clear();
	}
	
	@After //Ejecuta este código DESPUES de cada uno de los tests
	public void after() {
		System.out.println("after()");
//		calc.clear();
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	@Test
	public void testSum() {
//		Calculadora calc = new Calculadora();
		System.out.println("Sum()");
		int resul = calc.add(3, 2);
		int esperado = 5;
		assertEquals(esperado, resul);
	}
	
	@Test
	public void testAnsSum() {
//		Calculadora calc = new Calculadora();
		System.out.println("ansSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esperado = calc.ans();
		assertEquals(esperado, resul);
	}
	
	@Test()
	public void testDividir() {
		System.out.println("Test dividir()");
		calc.dividir(5, 5);
	}
	
	@Test(expected = ArithmeticException.class) 
	public void testDivPorCero() {
		System.out.println("Test divPorCero()");
		calc.dividir(1, 0);
	}
	
	@Test(timeout = 100)
	public void testAlgoritmoOptimo() {
		System.out.println("Test algoritmoOptimo");
		calc.operacionOptima();
	}
	
	
	 
}
