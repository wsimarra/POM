package Proyecto;

import PageObject.PagePrincipal;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {
     WebDriver firefoxDriver;
 PagePrincipal Pageprincipal;


    private  void  iniciaLizarPagina(WebDriver driver)
    {
       Pageprincipal=new PagePrincipal(driver);

    }

    @Before
    public void abrirDriver() {
        //encontrar archivo exe de geckodriver
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");

        //creamos opciones sobre nuestro driver
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", true );

        //nueva instancia de FirefoxDriver
        firefoxDriver = new FirefoxDriver(options);

        //definimos tiempo de espera hasta que aceptemos un timeout
        firefoxDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        iniciaLizarPagina(firefoxDriver);
        //Pageprincipal.addCart();

    }
    @After
    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        //firefoxDriver.quit();
    }

}
