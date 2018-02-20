package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import main.java.UserLogin;

class UserLoginTest {
	UserLogin userLogin = new UserLogin();

	@Test
	public void logoutSuccess() {
		assertTrue(userLogin.logout("Admin"));
		assertFalse(userLogin.logout("buyer"));

	}

	@Nested
	@DisplayName("Checktest for login feature")
	class LoginFeature {

		@Test
		void loginCorrect() {
			assertTrue(userLogin.login("admin", "password123"));
		}

		@Test
		void loginInCorrect() {
			assertFalse(userLogin.login("admin", "password123456"));
		}
	}
}