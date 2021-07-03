package com.config;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class BrowserConfig {
   public static WebDriver driver;

    public static void main(String[] args){

        chromeLaunch();
        //chromeClose();

    }
    public static void chromeLaunch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(//"https://google.com");
        System.out.println("successful");

    }
    public static void chromeClose(){
        driver.close();
        System.out.println("chrome closed");
    }

}
