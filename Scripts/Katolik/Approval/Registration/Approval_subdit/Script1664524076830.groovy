import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devapp-pendidikan.kemenag.go.id/')

WebUI.click(findTestObject('Object Repository/Katolik/Page_EMIS 4.0/div_Login'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_EMIS 4.0/div_Katolik'))

WebUI.setText(findTestObject('Object Repository/Katolik/Page_Login/input_E-mail_css-11aywtz r-16y2uox r-crgep1_e0e620'), 
    'kemenag_subdit_dasar_menengah_katolik@emis.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Katolik/Page_Login/input_Password_css-11aywtz r-16y2uox r-crge_090f36'), 
    'SpTCzH9Sqdj0llfYnf0duQ==')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Katolik/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Dashboard/div_Akun'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Dashboard/div_Permintaan Akun'))

WebUI.setText(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/input__css-11aywtz r-1pz39u2 r-cqee49 r-13a_ee316b'), 
    'Staf Lembaga')

WebUI.sendKeys(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/input__css-11aywtz r-1pz39u2 r-cqee49 r-13a_ee316b'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_staf_lembaga_menengahyopmail.com'))

WebUI.setText(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/input__css-11aywtz r-1pz39u2 r-cqee49 r-13a_ee316b'), 
    'staf_lembaga_menengah@yopmail.com')

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/span_'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Terima'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Apakah anda yakin untuk menyetujui perm_6201aa'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Batal'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/span_'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Tolak'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Anda akan menolak permintaan akun'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Alasan tidak boleh kosong'))

WebUI.setText(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/input_Alasan Di tolak_css-11aywtz r-cqee49 _86a357'), 
    'Salah Penamaan')

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_BatalTolak'))

WebUI.click(findTestObject('Object Repository/Katolik/Page_Permintaan Akun/div_Batal'))

