package com.niraj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestMagicBuilder {

	@Test
	void test() {
		assertEquals(18, MagicBuilder.getLucky());
	}

}
