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

WebUI.setText(findTestObject('Object Repository/Page_testautomation2 - Login/input_Email Address_loginEmail'), 'automation+22@surveysparrow.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_testautomation2 - Login/input_Password_loginPassword'), 'BfPki2FGfcM/icue0wPSBw==')

WebUI.click(findTestObject('Object Repository/Page_testautomation2 - Login/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/h3_Automated CSAT Chat Survey Created on 20'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_Share'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_WHATSAPP_img-wrapper fx-row fx-jc--cent_02735e'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/label_Reply STOP to opt-out. MsgDataRatesMa_9ad4c3'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_NextProceed'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/span_Send CSAT Survey Based on Conditions_c_7e680b'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/svg_On_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_Mon'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/svg_Mon_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_4'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/path'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/svg_Mon_css-19bqh2r'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_46'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_48'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_NextSave Schedule'))

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_Labels_ss-form--input ss-form--inp_9de3da'), 
    '=')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_'), '=9')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_9'), '=91')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_91'), '=9')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_9'), '=')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_'), '')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea_Labels_ss-form--input ss-form--inp_732f06'), 
    '+')

WebUI.setText(findTestObject('Object Repository/Page_testautomation2/textarea__1'), '+9')


WebUI.click(findTestObject('Object Repository/Page_testautomation2/a_NextSave Schedule'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/h4_Next 10 July 2023 0448 AM'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/h4_Next 10 July 2023 0448 AM'), 'Next: 10 July 2023 04:48 AM')

WebUI.click(findTestObject('Object Repository/Page_testautomation2/div_EditDelete'))

WebUI.click(findTestObject('Object Repository/Page_testautomation2/h4_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_testautomation2/div_Delete ChannelChannel deleted successfully'), 
    'Delete ChannelChannel deleted successfully')

