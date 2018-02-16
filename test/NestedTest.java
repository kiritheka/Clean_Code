package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import main.java.UserLogin;

class NestedTest {
	UserLogin userLogin=new UserLogin();
	
@Test
 public void logoutSuccess() {
   String userName = "Admin";
   assertTrue(userLogin.logout(userName));
  }
		
@Nested
@DisplayName("Checktest for login feature")
 class LoginFeature {
	 
	    @Test
	    void loginCorrect() {
	      boolean actual = userLogin.login("admin", "password123");
	      assertTrue(actual);
	    }
	 
	    @Test
	    void loginInCorrect() {
	      boolean actual = userLogin.login("admin", "password123456");
	      assertFalse(actual);
	    }
	}
}