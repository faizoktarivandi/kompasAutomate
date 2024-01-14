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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.kompas.com/')

WebUI.click(findTestObject('kompasLogin/halamanUtama/iconuser'))

WebUI.click(findTestObject('kompasLogin/halamanUtama/span_Login (1)'))

WebUI.click(findTestObject('kompasLogin/halamanLogin/input_KG Media ID_email'))

WebUI.setText(findTestObject('kompasLogin/halamanLogin/input_KG Media ID_email'), 'faizoktarivandi@gmail.com')

WebUI.click(findTestObject('kompasLogin/halamanLogin/input_Password_password'))

WebUI.setEncryptedText(findTestObject('kompasLogin/halamanLogin/input_Password_password'), '2bZXWlVPxzLCSswz1LWJbQ==')

WebUI.click(findTestObject('Object Repository/kompasLogin/halamanLogin/input_button -primary'))

WebUI.click(findTestObject('Object Repository/kompasLogin/halamanUtama/button_kgmModal-close'))

WebUI.setText(findTestObject('Object Repository/kompasLogin/halamanUtama/input_q'), 'robot')

WebUI.sendKeys(findTestObject('Object Repository/kompasLogin/halamanUtama/input_q'), Keys.chord(Keys.ENTER))

'Detect object diubah menjadi ke div(2), agar keyword apapun yang diinput tetap mengambil hasil kedua'
WebUI.click(findTestObject('kompasLogin/searchResult/searchResult1'))

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('kompasLogin/kompasArticle/endofArticle'), 0)

WebUI.back()

WebUI.click(findTestObject('kompasLogin/searchResult/searchResult2'))

WebUI.takeFullPageScreenshot()

WebUI.back()

