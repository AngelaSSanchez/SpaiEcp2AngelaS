package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User us;
	
    @Before
    public void before() {
        us = new User(1, "AnGela","serrANo");
    }


	@Test
	public void testFullName() {
        assertEquals("Angela Serrano", us.fullName());
	}

	@Test
	public void testGetName() {
		assertEquals("Angela", us.getName());
	}
	
	@Test
	public void testGetNumber() {
		assertEquals(1, us.getNumber());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Serrano", us.getFamilyName());
	}
	
	@Test
	public void testInitials() {
		assertEquals("A.", us.initials());
	}
/*	
	public void testFormatName(){
		us = new User("AnGeLa","serrano","SANCHEZ");
		assertEquals("Serrano Sanchez, Angela",us.ordenaNombre());
	}
*/
}
