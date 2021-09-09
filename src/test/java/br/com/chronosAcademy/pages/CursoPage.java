package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    private WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() {
        String xpathtitulo = "//section[2]//h2";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathtitulo));
        return h2Titulo.getText();

    }
}
