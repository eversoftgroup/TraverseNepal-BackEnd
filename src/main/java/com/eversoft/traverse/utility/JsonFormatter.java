package com.eversoft.traverse.utility;

public class JsonFormatter {

	public static String FormatJson(String key, String value) {
		return "{\""+ key +"\": \"" + value + "\"}";
	}
}
