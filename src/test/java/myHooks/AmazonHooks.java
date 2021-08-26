package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;


public class AmazonHooks {
	
	
	  @Before("@Smoke") 
	  public void setUp_browser(Scenario sc) {
	  System.out.println("Launch chrome browser");
	  System.out.println(sc.getName()); 
	  }
	 
	
	/*
	 * @Before(order = 2) public void setUp_browser(Scenario sc) {
	 * System.out.println("Launch chrome browser");
	 * System.out.println(sc.getName()); }
	 * 
	 * @Before(order = 1) public void setUp_url() {
	 * System.out.println("Launch amazon url"); }
	 */
	
	/*
	 * @After(order = 2) public void tearDown_logout() {
	 * System.out.println("Logout from Amazon"); }
	 * 
	 * @After(order = 1) public void tearDown_close(Scenario sc) {
	 * System.out.println("Close the browser"); System.out.println(sc.getName()); }
	 */
	
	
	  @After("@Smoke") 
	  public void tearDown_close(Scenario sc) {
	  System.out.println("Close the browser"); 
	  System.out.println(sc.getName()); 
	  }
	 
	
	@BeforeStep
	public void getScreenshot() {
		System.out.println("Take screenshot");
	}
	
	@AfterStep
	public void pageRefresh() {
		System.out.println("Refresh Page");
		
	}

}
