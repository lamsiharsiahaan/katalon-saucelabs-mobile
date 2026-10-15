import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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
import com.openai.models.responses.ResponsePrompt.Variables

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Define untuk Path Apk 
String projectPath = RunConfiguration.getProjectDir()

String apkPath = projectPath + GlobalVariable.pathApk

// Jalankan Aplikasi
Mobile.startApplication(apkPath, false)

// Input User invalid(Locked Out User / Invalid Password)
Mobile.setText(findTestObject('Page_Login/android.widget.EditText - Username'), invalidUsername, 10)

Mobile.setText(findTestObject('Page_Login/android.widget.EditText - Password'), invalidPassword, 10)

Mobile.tap(findTestObject('Page_Login/android.view.btnLogin'), 10)

// Verifikasi Pesan Error Muncul saat Login Gagal
Mobile.verifyElementExist(findTestObject('Page_Login/android.view.MessageErrorLogin'), 10)

// Close Application
Mobile.closeApplication()

