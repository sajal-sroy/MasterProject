package sample.web;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestLoginService {

	private LoginService service;
	
	@Before
	public void initilize(){
		service=new LoginService();
	}
	
	@Test
	public void validateUser(){
	      boolean result=service.validateUser("admin","admin");
	      assertTrue(result);
	}
	
}
