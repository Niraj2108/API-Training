package com.niraj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMessageBuilder {

	@Test
	void test1() {
		assertEquals("Hello,Niraj", MessageBuilder.getMessage());
	}
	
	@Test
	void test2() {
		assertEquals(12, MessageBuilder.getNumber());
	}

}
