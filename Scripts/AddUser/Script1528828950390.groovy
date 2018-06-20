import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
'Navigate to User Page'
WebUI.navigateToUrl('http://opensource.demo.orangehrmlive.com/index.php/admin/viewSystemUsers')
'Click Add to add User'
WebUI.click(findTestObject('Page_OrangeHRM/UserPage/input_btnAdd'))
'Check for Hint of Employees available'
WebUI.setText(findTestObject('Page_OrangeHRM/UserPage/input_systemUseremployeeNameem'), ' ')
'Enter Employee name that is already available'
WebUI.click(findTestObject('Page_OrangeHRM/UserPage/EmployeeListInstance1'))
'Enter UserName'
WebUI.setText(findTestObject('Page_OrangeHRM/UserPage/input_systemUseruserName'),'Stellium123')
'Enter Password'
WebUI.setText(findTestObject('Page_OrangeHRM/UserPage/input_systemUserpassword'),'Stellium@12')
'Confirm Password'
WebUI.setText(findTestObject('Page_OrangeHRM/UserPage/input_systemUserconfirmPasswor'),'Stellium@12')
'Click Save'
WebUI.click(findTestObject('Page_OrangeHRM/UserPage/input_btnSave'))