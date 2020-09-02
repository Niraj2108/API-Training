package com.niraj;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	 String message = "Niraj";
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      AssertJUnit.assertEquals(message, messageUtil.printMessage());
	   }

}
