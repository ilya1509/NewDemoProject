import cucumber.api.PendingException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		println " I am inside Given"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
		
	}
	
	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_passwords(String username, String password) {
		println " I am inside When"
		WebUI.setText(findTestObject('Object Repository/ScriptDemo/Page_OrangeHRM/input_Username_username'), username)
		WebUI.setText(findTestObject('Object Repository/ScriptDemo/Page_OrangeHRM/input_Password_password'), password)
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		println " I am inside And"
		WebUI.click(findTestObject('Object Repository/ScriptDemo/Page_OrangeHRM/button_Login'))
		
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		println " I am inside Then"
		WebUI.verifyTextPresent('Dashboard', false)
		WebUI.closeBrowser()
	}
}
