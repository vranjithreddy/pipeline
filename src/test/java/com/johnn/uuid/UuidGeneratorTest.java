package com.johnn.uuid;

import org.junit.Assert;
import org.junit.Test;

public class UuidGeneratorTest {

	@Test
	public void testUuidLength() {
		
		UuidGenerator uuidGenerator = new UuidGenerator();
		Assert.assertEquals(36, uuidGenerator.generateUuid().length());		
	}
}
