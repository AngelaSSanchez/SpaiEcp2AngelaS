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
	
	@Test
	public void testOrdenaNombre(){
		us = new User("David","Romero","Escobar");
		assertEquals("Romero Escobar, David",us.ordenaNombre());
		
		us = new User(1,"John","Smith");
		assertEquals("Smith, John",us.ordenaNombre());
	}
	
	@Test
	public void testFormatName(){
		us = new User("AnGeLa","serrano","SANCHEZ");
		assertEquals("Serrano Sanchez, Angela",us.ordenaNombre());
	}
	
}
