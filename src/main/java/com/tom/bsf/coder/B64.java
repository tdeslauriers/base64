package com.tom.bsf.coder;

import java.util.Base64;

public class B64 {

	//encode with padding
	public static String encodePad(String value) {
		
		byte[] bVal = value.getBytes();
		String encoded = Base64.getEncoder().encodeToString(bVal);
		return encoded;
	
	}
	
	//encode without padding
	public static String encodeNoPad(String value) {
			
			byte[] bVal = value.getBytes();
			String encoded = Base64.getEncoder().withoutPadding().encodeToString(bVal);
			return encoded;
	
	}
	
	//decode
	public static String decode(String value) {
		
		byte[] bVal = Base64.getDecoder().decode(value);
		return new String(bVal);
		
	}
}
