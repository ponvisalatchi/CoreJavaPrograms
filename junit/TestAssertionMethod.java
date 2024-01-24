package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssertionMethod {

	@Test
	public void test() {
		int a=10;
		int b=20;
		
		String str1=new String("Pon Visalatchi");
		String str2=new String("Pon Visalatchi");
		
		String str3="Kamatchi";
		String str4="Kamatchi";
		String str5=null;
		
		//assertNotSame(str1,str2);
		
		//assertSame(str1,str2);
		
		//assertTrue(a==b);
		
		assertFalse(a==b);
		
		//assertNull(str5);
		//assertNotNull(str5);
		
		String a1[]= {"one","two","three"};
		String a2[]= {"one","two","three"};
		
		assertArrayEquals(a1,a2);
	}

}
