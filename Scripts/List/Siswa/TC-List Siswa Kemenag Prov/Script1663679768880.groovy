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

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_Dashboard/div_Siswa'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_Dashboard/div_Daftar Siswa'))

WebUI.delay(1)

CurrentUrl = WebUI.getUrl()

WebUI.verifyMatch(CurrentUrl, 'https://devapp-pendidikan.kemenag.go.id/daftar-siswa-kemenag', false)

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaProvinsi/div_Semua Kota'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaProvinsi/div_KOTA ADM. JAKARTA PUSAT'))

CurrentUrlJakPus = WebUI.getUrl()

WebUI.verifyMatch(CurrentUrlJakPus, 'https://devapp-pendidikan.kemenag.go.id/daftar-siswa-kemenag?city_id=3171&page=1', 
    false)

def isNotPresent = WebUI.getText(findTestObject('Daftar Siswa Kemenag/Page_DaftarSiswaProvinsi/div_ADM. KEP. SERIBU'))

assert !(isNotPresent)

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaProvinsi/div_ADM. KEP. SERIBU_1'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaProvinsi/div_KOTA ADM. JAKARTA BARAT'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaProvinsi/div_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaKota/div_Lihat Detail'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaLembaga/div_'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaLembaga/div_Aktif Tanpa Rombel'))

WebUI.click(findTestObject('Object Repository/Daftar Siswa Kemenag/Page_DaftarSiswaLembaga/div_Aktif'))

