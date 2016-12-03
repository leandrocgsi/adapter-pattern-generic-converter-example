package com.uolinc.commons.utils;

public class JsonXmlUtils {
	
	public boolean isJson(String str) throws Exception {
		if(str != null && !str.equals("") && str.startsWith("<")){
			return false;
		} else if(str != null && !str.equals("") && str.startsWith("{")){
			return true;
		} else {
			throw new Exception();
		}
	}

}
