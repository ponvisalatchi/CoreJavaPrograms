package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		Square sq = new Square();
		int result = sq.countA("PonVisalatchi");
		assertEquals(2, result);

	}

}
