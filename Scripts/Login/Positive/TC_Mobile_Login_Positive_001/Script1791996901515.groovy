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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Gabungkan dengan Dynamic Project Directory
String projectPath = RunConfiguration.getProjectDir()

String apkPath = projectPath + GlobalVariable.pathApk

// Jalankan Aplikasi
Mobile.startApplication(apkPath, false)

// Jeda 10 detik agar halaman login siap sepenuhnya
Mobile.delay(5, null)

// Input User Valid & Login
Mobile.setText(findTestObject('Page_Login/android.widget.EditText - Username'), GlobalVariable.username, 10)

Mobile.setText(findTestObject('Page_Login/android.widget.EditText - Password'), GlobalVariable.password, 10)

Mobile.tap(findTestObject('Page_Login/android.view.btnLogin'), 10)

// Validasi Berhasil Masuk ke Halaman Products
Mobile.verifyElementExist(findTestObject('Page_Login/android.widget.LogoApp'), 10)

// Tutup Aplikasi
Mobile.closeApplication()

