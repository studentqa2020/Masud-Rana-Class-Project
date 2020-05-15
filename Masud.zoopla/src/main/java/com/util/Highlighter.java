package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {

	public void getcolor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid pink;');", element);

	}

	public void getcolor(WebDriver driver, WebElement element, String color) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 4px solid " + color + ";');",
				element);

	}

	public void getsalary() {

		
	}

	public static void getsalary(int a) {

		
	}
}