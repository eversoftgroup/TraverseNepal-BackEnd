package com.eversoft.traverse.utility;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.validator.EmailValidator;

public class StringUtils {
	public static boolean isEmail(String string) {	
		return EmailValidator.getInstance().isValid(string);
	}
	
	public static String generateRandomKey() {
		return RandomStringUtils.randomAlphanumeric(32);
	}
}
