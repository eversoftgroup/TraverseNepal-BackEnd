package com.eversoft.traverse.service;

import com.eversoft.traverse.misc.enums.AuthStatus;

public interface AuthService {
	public AuthStatus doLogin(String username, String passwordHash);
	public boolean isValidAPIKey(String key);
}
