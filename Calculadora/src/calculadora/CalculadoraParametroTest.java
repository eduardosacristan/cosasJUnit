package calculadora;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {
	
	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] {3, 1, 4});
		obj.add(new Object[] {2, 3, 5});
		obj.add(new Object[] {3, 3, 8});

		return obj;
	}
	
	private int a, b, exp;
	
	public CalculadoraParametroTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}

	@Test
	public void testAdd() {
		Calculadora calc = new Calculadora();
		int resultado = calc.add(a, b);
		assertEquals(exp, resultado);
	}

}
