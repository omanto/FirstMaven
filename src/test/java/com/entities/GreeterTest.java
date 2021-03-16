package com.entities;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();
	
	@Test
	public void greeterSayHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));
//		assertTrue(false);
	}
	
}
