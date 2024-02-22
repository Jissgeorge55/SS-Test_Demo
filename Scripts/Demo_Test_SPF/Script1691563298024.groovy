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

WebUI.callTestCase(findTestCase('Open_SS_Website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login_as_user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.callTestCase(findTestCase('Create_classic_survey'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_testautomation/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Section'))

WebUI.sendKeys(findTestObject('Page_testautomation/div_Type section title_public-DraftStyleDef_3fcaf7'), 'Single Page Form')

WebUI.click(findTestObject('Object Repository/Page_testautomation/label_Logic_checkmeout-checkbox-style'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation/label_Display Section Intro'), 'Display Section Intro')

WebUI.verifyElementChecked(findTestObject('Page_testautomation/span_Display Section Intro_checkmeout-switch-style'), 0)

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_Next, add questions'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation/i_Profile_ss-icon-delete_forever'), '')

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Opinion Scale'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'))

WebUI.sendKeys(findTestObject('Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'), 'Opinion Question')

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Multiple Choice'))

WebUI.sendKeys(findTestObject('Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'), 'Multiple choice question')

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_Bulk Choices'))

WebUI.setText(findTestObject('Object Repository/Page_testautomation/textarea_Learn more_choices'), 'mp 1\nmp 2\nmp 3\nmp 4\nmp 5\nmp 6')

WebUI.click(findTestObject('Object Repository/Page_testautomation/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Rating'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'))

WebUI.sendKeys(findTestObject('Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'), 'Rating Question')

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/div_Text'))

WebUI.sendKeys(findTestObject('Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'), 'Text question')

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_3Share'))

WebUI.click(findTestObject('Object Repository/Page_testautomation/a_Copy URL'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('https://testautomation.salesparrow.com/s/Testkatalondemospf/tt-iNHL6DmHSXHtRdRnVSZpAq?')

WebUI.click(findTestObject('Object Repository/Page_Test_katalon_demo_spf/button_1'))

