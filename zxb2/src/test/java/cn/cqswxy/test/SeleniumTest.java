package cn.cqswxy.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void screenshot(WebDriver webDriver,String name){
		File file = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("D:/"+name+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://127.0.0.1:8080/zxb2/loginPage.do");
		chromeDriver.findElementByName("userAccount").sendKeys("admin");
		chromeDriver.findElementByName("userPwd").sendKeys("admin");
		screenshot(chromeDriver, "loginPage");
		chromeDriver.findElementByXPath("//input[@type='submit']").click();
		screenshot(chromeDriver, "mainPage");
		chromeDriver.findElementByXPath("//select").sendKeys("鞋类");
		chromeDriver.findElementByXPath("//input[@name='goodsTitle']").sendKeys("想");
		chromeDriver.findElementByXPath("//input[@name='minPrice']").sendKeys("20");
		chromeDriver.findElementByXPath("//input[@name='maxPrice']").sendKeys("100");
		chromeDriver.findElementByXPath("//input[@name='minDate']").sendKeys("002019-09-01");
		chromeDriver.findElementByXPath("//input[@name='maxDate']").sendKeys("002020-09-01");
		screenshot(chromeDriver, "mainPageByselect");
		chromeDriver.findElementByXPath("//input[@type='submit']").click();
		screenshot(chromeDriver, "mainPage2");
		chromeDriver.findElementByXPath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[7]/a").click();
		Alert alert = chromeDriver.switchTo().alert();
		alert.accept();
	}

}
