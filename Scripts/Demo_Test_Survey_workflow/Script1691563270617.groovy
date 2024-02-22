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

WebUI.navigateToUrl('https://testautomation2.salesparrow.com/login')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/input_Email Address_loginEmail'), 'automation+22@surveysparrow.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_testautomation2/input_Password_loginPassword'), 'BfPki2FGfcM/icue0wPSBw==')

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_New Survey'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/h3_Classic Survey'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/span_Start Blank'))

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/input_Survey Title_ss-form--input'), 'Test Automation_SPF')

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Create Survey'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Section'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Next, add questions'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Opinion Scale'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Multiple Choice'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Bulk Choices'))

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_Learn more_choices'), 'mp 1\nmp 2\nmp 3\nmp 4\nmp 5')

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Save'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Rating'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Text'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Add Next Question'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Email'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_3Share'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Copy URL'))

WebUI.switchToWindowTitle('Test Automation_SPF')

WebUI.click(findTestObject('Object Repository/Page_Test Automation_SPF/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Test Automation_SPF/button_1'))

WebUI.click(findTestObject('Object Repository/Page_Test Automation_SPF/button_mp 3KEYC'))

WebUI.click(findTestObject('Object Repository/Page_Test Automation_SPF/path_Rating_ss-survey-text-color--secondary_8bac29'))

WebUI.setText(findTestObject('Object Repository/Page_Test Automation_SPF/textarea_Text Question_answer-option--input_c0ef73'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Test Automation_SPF/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Test Automation_SPF/input_Email Question_answer-option--input s_862325'), 
    'test@testmail.com')

WebUI.click(findTestObject('Object Repository/Page_Test Automation_SPF/button_Submit'))

WebUI.switchToWindowTitle('testautomation2')

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_4Results'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Responses'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/td_Anonymous'), 'Anonymous')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/th_Opinion Question'), 'Opinion Question')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/div_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/th_Multiple Choice Que'), 'Multiple Choice Que...')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/td_mp 3'), 'mp 3')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/span_Rating'), 'Rating')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_testautomation2/path'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_testautomation2/svg_Mon_css-19bqh2r'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_testautomation2/svg_Mon_css-19bqh2r'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/th_Text Question'), 'Text Question')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/h4_test'), 'test')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/span_Email Question'), 'Email Question')

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/td_testtestmail.com'), 'test@testmail.com')

WebUI.click(findTestObject('Object Repository/Page_testautomation2/path'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_TEProfile SettingsSwitch to PortalRefer_41a6fe'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/li_Logout'))

