package ua.training.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppJUnit4Test {

	@Test
	public void helloWorldTest() {
		String str = "Hello world!";
		assertEquals("Hello world!", str);
	}

}
