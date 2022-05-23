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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_Name_firstName'), 'Htoo')

WebUI.setText(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_Name_lastName'), 'Eaindra')

WebUI.setText(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_Email_userEmail'), 'htooeaindralin1@gmail.com')

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/label_Female'))

WebUI.setText(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_(10 Digits)_userNumber'), '09282772')

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_Date of Birth_dateOfBirthInput'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_24'))

WebUI.scrollToPosition(999999, 999999)

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_Subjects_subjectsInput'), 'co')

WebUI.click(findTestObject('ToolQA/PracticeForm/Page_ToolsQA/div_Computer Science'))

WebUI.scrollToPosition(99999, 99999)

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/label_Reading'))

WebUI.uploadFile(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/input_Select picture_uploadPicture'), 
    'C:\\Users\\user\\Desktop\\Personal\\TOKOYORevengers\\2.webp')

WebUI.setText(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/textarea_Current Address_currentAddress'), 
    'Mandalay')

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/form_NameEmailGenderMaleFemaleOtherMobile(1_1cf260'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_option Uttar Pradesh focused, 2 of 4. 4_eaba9c'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_Uttar Pradesh'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_option Agra focused, 1 of 3. 3 results _907529'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_Lucknow'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/div_option Lucknow, selected. option Luckno_5f7450'))

WebUI.click(findTestObject('Object Repository/ToolQA/PracticeForm/Page_ToolsQA/form_NameEmailGenderMaleFemaleOtherMobile(1_94a134'))

WebUI.closeBrowser()

