package com.johnn.uuid;

import java.util.UUID;
/**
 * @author johnn
 *
 * UuidGenerator class to generate a universal unique identifier.
 */
public class UuidGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UuidGenerator uuidGenerator = new UuidGenerator();
		System.out.println("UUID: " + uuidGenerator.generateUuid());

	}
	
	public String generateUuid() {
		
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
		
	}

}
