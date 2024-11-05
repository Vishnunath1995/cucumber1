package org.steps;

import java.util.List;

import org.base.BaseClass;
import org.pom.LoginPojo;

import io.cucumber.java.en.*;

public class StepsDefenitions extends BaseClass {
	

//@Given("user should be entering the valid login page")
//public void user_should_be_entering_the_valid_login_page() {
//   browser("chrome");
//   launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//   maxwindow();
//}
//
//@When("the user check login function with invalid {string} and {string}")
//public void the_user_check_login_function_with_invalid_and(String user, String pass) {
//   LoginPojo l=new LoginPojo();
//   waitt();
//   
//   sendkeys(l.getUsername(),user);
//  
//   sendkeys(l.getPassword(),pass);
//   
// //  btnClick(l.getButton());
//   
//}
//
//@Then("user clicked on login button")
//public void user_clicked_on_login_button() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@Then("user navigate to error login page")
//public void user_navigate_to_error_login_page() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//
//@Given("the user should be entered into valid login page")
//public void the_user_should_be_entered_into_valid_login_page() {
//	  browser("chrome");
//	   launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	   maxwindow();
//}
//
//@When("user fill the valid username {string} password {string}")
//public void user_fill_the_valid_username_password(String string, String string2) {
//	 LoginPojo l=new LoginPojo();
//	   waitt();
//	   
//	   sendkeys(l.getUsername(),string);
//	  
//	   sendkeys(l.getPassword(),string2);
//	   
//}
//
//@Then("user should click the login button")
//public void user_should_click_the_login_button() {
//	LoginPojo l=new LoginPojo();
//	  btnClick(l.getButton());
//}
//	@Then("user navigate to the valid page")
//	public void user_navigate_to_the_valid_page() {
//		throw new cucumber.api.PendingException();
//	}
//
//
///*================= withouttitle one D WebTable=================== */
//
//
//
//	@Given("user should be entering the valid login page")
//	public void user_should_be_entering_the_valid_login_page() {
//	 browser("chrome");
//	   launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	   maxwindow();
//}
//@When("user enter the valid username and valid password")
//public void user_enter_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
//   LoginPojo l=new LoginPojo();
//   waitt();
//   List<String> li = dataTable.asList();
//   String user = li.get(0);
//   String pass = li.get(1);
//   sendkeys(l.getUsername(), user);
//   sendkeys(l.getPassword(), pass);
//   
////   sendkeys(l.getUsername(), li.get(0));
////   sendkeys(l.getPassword(), li.get(1));
//   
//  
//  
//}
//@Then("user clicked on login button")
//public void user_clicked_on_login_button() {
//	 LoginPojo l=new LoginPojo();
//	 btnClick(l.getButton());
//}
//
//@Then("user landing on the valid page")
//public void user_landing_on_the_valid_page() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new cucumber.api.PendingException();
//}
//


/*================= withouttitle two D WebTable=================== */
@Given("user should be entering the valid login page")
public void user_should_be_entering_the_valid_login_page() {
 browser("chrome");
   launchurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   maxwindow();
}
@When("user enter the valid username and valid password")
public void user_enter_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
LoginPojo l=new LoginPojo();
waitt();
 List<List<String>> list = dataTable.asLists();
// List<String> user = list.get(0);
//List<String> pass = list.get(1);

//sendkeys(l.getUsername(),list.get(0).get(0));
//sendkeys(l.getPassword(), list.get(0).get(1));

//sendkeys1(l.getUsername(), user);
//sendkeys1(l.getPassword(), pass);




}
@Then("user clicked on login button")
public void user_clicked_on_login_button() {
 LoginPojo l=new LoginPojo();
 btnClick(l.getButton());
}

@Then("user landing on the valid page")
public void user_landing_on_the_valid_page() {
// Write code here that turns the phrase above into concrete actions
throw new cucumber.api.PendingException();
}

}
