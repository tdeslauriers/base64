package com.tom.bsf.options;

import com.tom.bsf.coder.B64;

public class Handler {
	
	public static String coder(String option, String value) {
		
		Tack tack = Tack.valueOf(option);
		String result;
		
		switch(tack) {
			case ep:
				result = B64.encodePad(value);
				break;
			case e:
				result = B64.encodeNoPad(value);
				break;
			case d:
				result = B64.decode(value);
				break;
			default:
				throw new IllegalArgumentException("Must use tack:\n"
													+ "\t'e'  :  encode w/o padding.\n"
													+ "\t'ep' :  encode padded.\n"
													+ "\t'd'  :  decode.");
		}
		return result;
	}
	
}
