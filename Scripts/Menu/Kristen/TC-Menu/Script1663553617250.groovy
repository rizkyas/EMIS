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

WebUI.openBrowser(GlobalVariable.URL_DEV)

WebUI.click(findTestObject('Object Repository/Page_EMIS 4.0/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_EMIS 4.0/div_Kristen'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_E-mail_css-11aywtz r-16y2uox r-crgep1_e0e620'), 'pengelola_sdtk_negeri@emis.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_css-11aywtz r-16y2uox r-crge_090f36'), 
    'SpTCzH9Sqdj0llfYnf0duQ==')

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Kelembagaan'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Profil'))

WebUI.click(findTestObject('Object Repository/Page_Identitas/div_Lokasi'))

WebUI.click(findTestObject('Object Repository/Page_Lokasi/div_Galeri Foto'))

WebUI.click(findTestObject('Object Repository/Page_Galeri Foto/div_Dokumen Legalitas'))

WebUI.click(findTestObject('Object Repository/Page_Dokumen Legalitas/div_Personel'))

WebUI.click(findTestObject('Object Repository/Page_Personel/div_Prestasi'))

WebUI.click(findTestObject('Object Repository/Page_Prestasi/div_Bantuan Operasional'))

WebUI.click(findTestObject('Object Repository/Page_Bantuan Operasional/div_Kurikulum'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_KURIKULUM  KEGIATAN BELAJAR/div_Nilai Ujian'))

WebUI.click(findTestObject('Object Repository/Page_AKM/div_Kelembagaan'))

WebUI.click(findTestObject('Object Repository/Page_AKM/div_Bantuan'))

WebUI.click(findTestObject('Object Repository/Page_KEUANGAN/div_Sarana Prasarana'))

WebUI.click(findTestObject('Object Repository/Page_KEUANGAN/div_Lahan dan Bangunan'))

WebUI.click(findTestObject('Object Repository/Page_KEUANGAN/div_Lahan'))

WebUI.click(findTestObject('Object Repository/Page_Asset Tetap/div_Lahan dan Bangunan'))

WebUI.click(findTestObject('Object Repository/Page_Asset Tetap/div_Gedung'))

WebUI.click(findTestObject('Object Repository/Page_Asset Tetap/div_Lahan dan Bangunan'))

WebUI.click(findTestObject('Object Repository/Page_Asset Tetap/div_Ruangan'))

WebUI.click(findTestObject('Object Repository/Page_Asset Tetap/div_Asset Lancar'))

WebUI.click(findTestObject('Object Repository/Page_SaranaPrasaranaAssetLancar/div_Perpustakaan'))

WebUI.click(findTestObject('Object Repository/Page_BUKU PERPUSTAKAAN/div_Siswa'))

WebUI.click(findTestObject('Object Repository/Page_BUKU PERPUSTAKAAN/div_Daftar Siswa'))

