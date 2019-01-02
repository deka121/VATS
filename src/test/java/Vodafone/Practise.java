package Vodafone;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practise {

	@BeforeTest
	
	public void OpenUrl() {
		
		System.out.println("open URL");
	}
	
	@Test
	
	public void Login() {
		
		System.out.println("Login");
	}
	
	
	@AfterTest
	
public void Logout() {
		
		System.out.println("Logout");
	}
}
