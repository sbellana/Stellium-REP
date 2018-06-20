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

not_run: WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Navigate to Job Vacancy Page'
WebUI.navigateToUrl('http://opensource.demo.orangehrmlive.com/index.php/recruitment/viewJobVacancy')

'Click on Add to Create Vacancy'
WebUI.click(findTestObject('Page_OrangeHRM/Vacancy Page/input_btnAdd'))

'Fill in Job Title'
WebUI.selectOptionByValue(findTestObject('Page_OrangeHRM/Vacancy Page/select_-- Select --Account Cle'), '8', true)

'Fill in JobVacancy Type'
WebUI.setText(findTestObject('Page_OrangeHRM/Vacancy Page/input_addJobVacancyname'), 'FullTime')

'Click for Hint'
WebUI.setText(findTestObject('Page_OrangeHRM/Vacancy Page/input_addJobVacancyhiringManag'), ' ')

'Fill in HR Name'
WebUI.click(findTestObject('Page_OrangeHRM/Vacancy Page/li_HR Manager'))

'Enter no of positions available'
WebUI.setText(findTestObject('Page_OrangeHRM/Vacancy Page/input_addJobVacancynoOfPositio'), '12')

'Save the entry'
WebUI.click(findTestObject('Page_OrangeHRM/Vacancy Page/input_btnSave'))

