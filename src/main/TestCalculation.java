package main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculation {

	@Test
	public void test() {
		assertEquals(4, Calculation.findMax(new int[]{1,3,4,2}));
		assertEquals(-1, Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
	}

}
