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

WebUI.navigateToUrl('https://testautomation.salesparrow.com/login')

WebUI.setText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/input_Email Address_loginEmail'), 
    'automation+2@surveysparrow.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/input_Password_loginPassword'), 
    'BfPki2FGfcM/icue0wPSBw==')

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_Login'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_New Survey'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Classic Survey'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/span_Start Blank'))

WebUI.setText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/input_Survey Title_ss-form--input'), 
    GlobalVariable.Survey_Name)

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_Create Survey'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Welcome Page'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/span_Hi.Hello.Hola.Hey'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Opinion Scale'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Rating'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Start typing_public-DraftStyleDefault-b_9cab06'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/i_Profile_ss-icon-plus_round'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Thank You Page'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Click here to upload a thank you imageT_ad0a40'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_This is a welcome question1This is a op_8d8ab7'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/path'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/h3_Test_Automation'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Classic FormTest_AutomationIn My Survey_a0fd66'), 
    'Classic FormTest_AutomationIn My Surveys . Last Modified: 1s ago08 Jul 2023, 09:02 PM2Questions0Responses--Completion Rate')

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_Classic FormTest_AutomationIn My Survey_a0fd66'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/path_1'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_3Share'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_Copy URL'))

WebUI.switchToWindowTitle('Test_Automation')

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/span_Sure, ask'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/span_This is a opinion question'), 
    'This is a opinion question')

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/div_0Least Likely12345Neutral678910Most Likely'), 
    '0Least Likely12345Neutral678910Most Likely')

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/button_Skip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/p_Question 1'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/button_4'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/circle_Report abuse_ss-progress-fill'), 
    '')

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/path_This is a rating question_ss-survey-te_98f8fc'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/button_Submit'), 'Submit')

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_Test_Automation/p_Thank you'), 'Thank you')

WebUI.switchToWindowTitle('testautomation')

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_4Results'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/svg_JUL 800.250.50.751TOTAL RESPONSES'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/path_TOTAL RESPONSES_recharts-rectangle'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/h2_Completion Rate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/h2_100'))

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/h2_100'), '100%')

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/h1_By Device'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/path_By Device_recharts-sector'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/path_By Device_recharts-sector'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/path_By Device_recharts-sector'))

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_Reports'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/h1_Default Report'), 
    0)

WebUI.click(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/a_Responses'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/th_Response Info'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/div_4'), '4')

WebUI.verifyElementText(findTestObject('Object Repository/Create_Attend_survey/Page_testautomation/td'), '')

WebUI.closeBrowser()

