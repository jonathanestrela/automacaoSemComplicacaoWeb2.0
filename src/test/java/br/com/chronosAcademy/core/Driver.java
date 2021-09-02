package br.com.chronosAcademy.core;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
   private WebDriver driver;

   public Driver(String navegador){
      switch (navegador){
         case "edge":
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            break;

         case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;

         case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
      }

      driver.manage().window().maximize();

   }

   public WebDriver getDriver(){
      return driver;
   }

}
