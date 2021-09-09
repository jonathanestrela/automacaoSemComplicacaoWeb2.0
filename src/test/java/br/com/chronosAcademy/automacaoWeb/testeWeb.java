package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.pages.CursoPage;
import br.com.chronosAcademy.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class testeWeb {
    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;



    @Before
    public void inicializaTeste(){
        driverWeb = new Driver ("edge");

        driver = driverWeb.getDriver();

        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);


    }

    @Test
    public void primeiroTeste(){

        String titulo = principalPage.getTitulo();

        assertEquals("Porque Tempo É Conhecimento", titulo);

    }



    @Test
    public void segundoTeste(){

        principalPage.clickBotao();
        cursoPage = new CursoPage(driver);

        String titulo = cursoPage.getTitulo2();

        assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", titulo);

    }



    @After
    public void finalizaTeste(){

        driver.quit();
    }

}
