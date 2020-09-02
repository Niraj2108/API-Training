package com.niraj;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	String message = "Niraj";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Niraj";
		AssertJUnit.assertEquals(message, messageUtil.salutationMessage());
	}

}
