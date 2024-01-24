package junit;
/* 1. Write +ve and -ve test cases to check Login() Username="admin" and Password="admin123".*/
import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLoginTest {

	@Test
	public void Positivetest() {
			CheckLoginTest login=new CheckLoginTest();
			login.setUsername("admin");
			login.setPassword("admin123");
			assertTrue(login.checklogintest());
			
	    @Test
	    public void Negativetest() {
			CheckLoginTest login=new CheckLoginTest();
			login.setUsername("pons");
			login.setPassword("pons0209");
			assertFalse(login.checklogintest());
			
		}

}
