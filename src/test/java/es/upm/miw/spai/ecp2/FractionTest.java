package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction f;
	
	@Before
	public void before(){
		f = new Fraction(7,2);
	}

	@Test
	public void testComponents() {
		assertEquals(7,f.getNumerator());
		assertEquals(2,f.getDenominator());
	}
	
	@Test
	public void testDecimal() {
		assertEquals(3.5,f.decimal(),10e-5);
	}

	public void testDivision(){
		this.f.dividirFraccion(new Fraction(1,3));
		assertEquals(21,f.getNumerator());
		assertEquals(2,f.getDenominator());
	}
	
	public void testFraccionMenor(){
		this.f.menorFraccion(new Fraction(1,3));
		assertEquals(1,f.getNumerator());
		assertEquals(3,f.getDenominator());
	}
	
	public void testFraccionMulti(){
		this.f.multiplicarFraccion(new Fraction(1,3));
		assertEquals(7,f.getNumerator());
		assertEquals(6,f.getDenominator());
	}

}
