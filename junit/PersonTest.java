package junit;
/* 1. Write +ve and -ve test cases to check age of person in check Age() if age>=18,returns true.*/

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void Positivetest() {
		Login login=new Login();
		login.setUsername("admin");
		login.setPassword("admin123");
		assertTrue(login.checklogin());
		
    @Test
    public void Negativetest() {
		Login login=new Login();
		login.setUsername("pons");
		login.setPassword("pons0209");
		assertFalse(login.checklogin());
		
	}

}
