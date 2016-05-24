package epam.test;

import static org.junit.Assert.*;

import org.junit.Test;

import epam.designPattern.builder.User;

public class BuilderTest {

	@Test
	public void testBuilder() {
		User rohit = new User.UserBuilder("Rohit","Vaidya").setAge(10).setPhone(123).build();
		assertEquals("Rohit", rohit.getFirstName());
		assertEquals("Vaidya",rohit.getLastName());
		assertEquals(10,rohit.getAge());
		assertEquals(123,rohit.getPhone());
	}

}
