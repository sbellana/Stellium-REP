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
import org.openqa.selenium.Keys as Keys

not_run : WebUI.callTestCase(findTestCase('Login'),[:],FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://opensource.demo.orangehrmlive.com/index.php/performance/searchPerformancReview')

WebUI.click(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_btnAdd'))

WebUI.setText(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_saveReview360Formemploye'), ' ')

WebUI.click(findTestObject('Page_OrangeHRM/Manage Reviews Page/li_EmployeeName'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_saveReview360Formsupervi'), ' ')

WebUI.click(findTestObject('Page_OrangeHRM/Manage Reviews Page/li_SupervisorName'))

WebUI.setText(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_saveReview360FormworkPer'), '1993-03-28')

WebUI.setText(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_saveReview360FormworkPer_1'), '2018-03-28')

WebUI.setText(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_saveReview360FormdueDate'), '2018-04-28')

WebUI.click(findTestObject('Page_OrangeHRM/Manage Reviews Page/input_saveBtn'))



