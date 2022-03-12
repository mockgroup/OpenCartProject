package com.qa.testcases;

import org.testng.annotations.Test;

public class NewTest extends TestBaseClass{
	
	@Test
	public void f() {
		click(hp.get_MyAccount());
	}
}
