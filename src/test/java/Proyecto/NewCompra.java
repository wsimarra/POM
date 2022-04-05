package Proyecto;

import PageObject.PagePrincipal;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCompra extends BaseTestSuite {

     @Test
    public void hacer_una_compra() {
        //Abrimos una URL
        firefoxDriver.get("https://www.saucedemo.com/");

         Pageprincipal.loGin("standard_user","secret_sauce");
         Pageprincipal.addCart();
         Pageprincipal.irCart();
         Pageprincipal.formulario();
         Pageprincipal.diligenciarFormulario("WILMER","SIMARRA C","13001");
         Pageprincipal.btnContinue();
         Pageprincipal.btnFind();
         Pageprincipal.retornoComercio();


     }


}