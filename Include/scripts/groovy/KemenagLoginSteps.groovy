import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class KemenagLoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to navigate to EMIS System Homepage")
	def NavigateToLoginPage() {
		println ("\n Homepage EMIS be displayed")
		WebUI.delay(2)
	}

	@When("I click login button")
	def GoToOptionLogin() {
		println ("\n Option Login be displayed" )

		WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_EMIS 4.0/div_Login'))

		WebUI.delay(2)
	}

	@And("I click Kristen button")
	def GoToLoginForm() {
		println ("\n Form Login be Displayed" )
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_EMIS 4.0/div_Kristen'), 0)) {
			WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_EMIS 4.0/div_Kristen'))
		}else {
			WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_EMIS/div_Kristen'))
		}
	}

	@And("I enters (.*) and (.*)")
	def EnterCredential(String username, String password) {
		println ("\n Input Credentials" )
		println ("username :"+username)
		println ("password :"+password)
		WebUI.setText(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_Login/input_E-mail_css-11aywtz r-16y2uox r-crgep1_e0e620'),
				username)

		WebUI.setText(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_Login/input_E-mail_css-11aywtz r-16y2uox r-crgep1_e0e620'),
				password)
	}

	@And("I click captcha chekbox")
	def ClickCaptcha() {
		println ("\n Click Captcha" )

		WebUI.delay(5)
	}

	@And("I click on captcha image")
	def ClickCaptchaImage() {
		println ("\n Click Captcha Image" )

		WebUI.delay(5)
	}

	@And("I click Login button")
	def ClickLoginButto() {
		println ("\n Click Login Button" )

		WebUI.click(findTestObject('Object Repository/Page_Login/div_Login'))

		WebUI.delay(2)
	}

	@Then("I shouldbe able to dashboard page")
	def GoToDashboardPage() {
		println ("\n Dashboard Page be displayed" )

		String CurrentUrl = WebUI.getUrl()

		WebUI.verifyMatch(CurrentUrl, 'https://devapp-pendidikan.kemenag.go.id/dashboard', false)
		WebUI.closeBrowser()

		WebUI.openBrowser(GlobalVariable.URL_DEV)
	}

	@And("I enter invalid username (.*) and password (.*)")
	def I_enter_invalid_username_password(String username, String password) {

		WebUI.setText(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_Login/input_E-mail_css-11aywtz r-16y2uox r-crgep1_e0e620'),
				username)

		WebUI.setText(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_Login/input_E-mail_css-11aywtz r-16y2uox r-crgep1_e0e620'),
				password)
	}
	@Then("Pop up alert be displayed")
	def I_login_unsuccessfully() {
		WebUI.verifyTextPresent('Login gagal, silahkan cek kembali email atau password Anda.', false)
		WebUI.closeBrowser()

		WebUI.openBrowser(GlobalVariable.URL_DEV)
	}
}