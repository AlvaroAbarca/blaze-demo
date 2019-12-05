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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://blazedemo.com/')

WebUI.selectOptionByValue(findTestObject('Buy a Flight/Search Flight/Select Paris - Philadelphia - Boston - Portland - San Diego - Mexico City - So Paolo'), 
    'San Diego', true)

WebUI.selectOptionByValue(findTestObject('Buy a Flight/Search Flight/Select Buenos Aires - Rome - London - Berlin - New York - Dublin - Cairo'), 
    'Dublin', true)

WebUI.click(findTestObject('Buy a Flight/Search Flight/Choose your destination Input'))

WebUI.waitForPageLoad(50)

WebUI.click(findTestObject('Buy a Flight/Reserva/Button 4'))

WebUI.waitForPageLoad(50)

WebUI.setText(findTestObject('Buy a Flight/Purchase/Name Input'), 'John Doe')

WebUI.setText(findTestObject('Buy a Flight/Purchase/Address Input'), 'John City')

WebUI.setText(findTestObject('Buy a Flight/Purchase/City Input'), 'Joni')

WebUI.setText(findTestObject('Buy a Flight/Purchase/State Input'), 'Noni')

WebUI.setText(findTestObject('Buy a Flight/Purchase/Zip Code Input'), '12345')

WebUI.setText(findTestObject('Buy a Flight/Purchase/Credit Card Number Input'), '123123123')

WebUI.setText(findTestObject('Buy a Flight/Purchase/Name on Card Input'), 'John Doe JR')

WebUI.click(findTestObject('Buy a Flight/Purchase/Remember me Input'))

WebUI.click(findTestObject('Buy a Flight/Purchase/Comprar Vuelo Input'))

WebUI.waitForPageLoad(50)

WebUI.getText(findTestObject('Buy a Flight/Confirmation Page/H1 Confirmation'))

WebUI.closeBrowser()

