package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
public class AnnotationsTest {

	@Test
	public void test1() {
		System.out.println("Test Case 1: Inside test case");
		
	}
	@Test
	public void test2() {
		System.out.println("Test Case 2: Inside test case");
		
	}
	@Before
	public void before() {
		System.out.println("Inside Before");
		
	}
	@After
	public void after() {
		System.out.println("Inside After");
	}
	//Test
	
	public void ignore() {
		System.out.println("Inside ignore: it'll not execute");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Inside After class");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside before class");
	}
	



}
