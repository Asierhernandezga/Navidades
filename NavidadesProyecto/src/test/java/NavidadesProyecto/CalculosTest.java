package NavidadesProyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculosTest {

	private Calculos calculos = new Calculos();
	private int resultadoInt;
	private double resultadoDouble;
	private int x, y;
	
	@Test
	public void testSuma() {
		x=4;
		y=7;
		
		resultadoInt = calculos.suma(x, y);
		
		org.junit.Assert.assertEquals(11, resultadoInt);
	}
	

	@Test
	public void testResta() {
		x=4;
		y=8;
		
		resultadoInt = calculos.resta(x, y);
		
		org.junit.Assert.assertEquals(-3, resultadoInt);
}

	@Test
	public void testDivisionDistinto0Division() {
		x=4;
		y=7;
		
		resultadoDouble = calculos.division(x, y);
		
		org.junit.Assert.assertEquals(0.57, resultadoDouble, 0.002);
	}
	
	@Test
	public void testDivisionIgual0Division() {
		x=4;
		y=7;
		
		resultadoDouble = calculos.division(x, y);
		
		org.junit.Assert.assertEquals(-1, resultadoDouble, 0.002);
	}	
}