package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection dc;
    
    @Before
    public void before(){
    	dc = new DecimalCollection();
    	dc.add(3.4);
    	dc.add(2.1);
    	dc.add(14.3);
    	dc.add(1.2);
    }
	
	@Test
	public void testSize() {
		assertEquals(4,dc.size());
	}

	@Test
	public void testSuma() {
		assertEquals(21,dc.sum(),10e-5);
	}
	
	@Test
	public void testMedia() {
		assertEquals(10.5,dc.media(),10e-5);
	}
	
	@Test
	public void testSmaller() {
		assertEquals(1.2,dc.smaller(),10e-5);
	}
	
	@Test
	public void testHigher() {
		assertEquals(14.3,dc.higher(),10e-5);
	}
}
