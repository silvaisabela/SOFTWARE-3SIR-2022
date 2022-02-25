package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testeSomar5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 8;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	public void testeSomar5com6() {
		int variavel1 = 5;
		int variavel2 = 6;
		int resultadoEsperado = 11;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeMultiplicar5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 15;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	
	@Test
	public void testeSubtrair5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 2;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeDividir5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 1;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}

}
