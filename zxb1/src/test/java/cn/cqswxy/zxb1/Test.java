package cn.cqswxy.zxb1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	private static void screenshot(File file,String path){
		try {
			FileUtils.copyFile(file, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://127.0.0.1:8080/zxb1/listPage.do");
		File file = ((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		screenshot(file, "D:/screenshot1.jpg");
	}

}
