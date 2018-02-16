package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.platform.commons.util.StringUtils;

public class UserLogin {

	public boolean login(String username, String password) {
	    if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
	      throw new IllegalArgumentException("Username and password must not be null or empty");
	    }
	    else if (username.equals("admin") && password.equals("password123")) {
	      return true;
	    }
	    return false;
	  }

	 public boolean logout(String username) {
		    ArrayList<String> existingUsers = new ArrayList<>(Arrays.asList("Admin", "Customer", "Supplier"));
		    if (existingUsers.contains(username)) {
            System.out.println("Successfully LoggedOut");		   
            }
		    return true;
		 }
}
