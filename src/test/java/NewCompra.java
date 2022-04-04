import org.junit.Before;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class NewCompra {
    private WebDriver firefoxDriver;

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
        firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       }
    @Test
    public void hacer_una_compra() {
        //Abrimos una URL
        firefoxDriver.get("http://www.automationpractice.com/index.php");

        //Crear elementos Web
        WebElement labelSignIn = firefoxDriver.findElement(By.xpath("//*[@title='Log in to your customer account']"));
        labelSignIn.click();

        //Cargamos el campo de email
        WebElement campoEmail = firefoxDriver.findElement(By.cssSelector("#email"));
        campoEmail.sendKeys("wilmer.simarra@gmail.com");

        //Cargamos el campo de contraseña
        WebElement campoPassword = firefoxDriver.findElement(By.cssSelector("#passwd"));
        campoPassword.sendKeys("123SIMARRA123");

        //Hacemos click en Sign in
        WebElement botonSignIn = firefoxDriver.findElement(By.cssSelector("#SubmitLogin"));
        botonSignIn.click();

        //Seleccionamos la pestaña de "T-shirts"
        WebElement etiquetaTshirts = firefoxDriver.findElement(By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[contains(text(),'T-shirts')]"));
        etiquetaTshirts.click();
        //Creamos una acción
        Actions action = new Actions(firefoxDriver);

        //Encontramos un elemento de la imagen que queremos comprar
        WebElement we = firefoxDriver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
//
//        //Movemos el cursor hacia el boton de agregar al carrito
        WebElement cart = firefoxDriver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
        cart.click();

//       //Hacemos click en el primer boton para cerrar compra
        firefoxDriver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();


    }

    @After
    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        //firefoxDriver.quit();
    }
}