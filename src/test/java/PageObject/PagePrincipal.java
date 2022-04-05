package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagePrincipal {

    @FindBy (xpath = "//input[@id='user-name']")
    WebElement uSer;

    @FindBy (xpath = "//input[@id='password']")
    WebElement passWord;
    @FindBy (xpath="//input[@id='login-button']" )
    WebElement loginButton;

     @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
     WebElement getAddcart;

     @FindBy (id="shopping_cart_container" )
     WebElement ircart;

     @FindBy (xpath = "//button[@id='checkout']")
      WebElement getBtndatos;

     @FindBy (xpath = "//input[@id='first-name']")
     WebElement nombre;

     @FindBy (xpath = "//input[@id='last-name']")
     WebElement apellido;

     @FindBy (xpath = "//input[@id='postal-code']")
     WebElement codPostal;

     @FindBy(id ="continue")
     WebElement btnContinue;

     @FindBy (xpath ="//button[@id='finish']")
      WebElement btnEnd;

      @FindBy (xpath = "//button[@id='back-to-products']")
      WebElement  btnInicio;


    public   void loginAcceso(String user){
        uSer.sendKeys(user);
    }
    public   void  passWordU(String pass){
        passWord.sendKeys(pass);
    }
    public   void  btnlogin(){
        loginButton.click();
    }
    public void loGin(String user, String pass){
       loginAcceso(user);
        passWordU(pass);
        btnlogin();
    }
    public PagePrincipal(WebDriver driver)

    {
        PageFactory.initElements(driver, this   );
    }

    public  void  addCart(){
        getAddcart.click();
    }

    public  void  irCart(){
        ircart.click();
    }
    public  void formulario(){
        getBtndatos.click();
      }
public  void  noMbre(String nom){
    nombre.sendKeys(nom);
}
    public  void  aPellido(String apell){
        apellido.sendKeys(apell);
    }
 public  void codigoPostal(String codpostal ){
     codPostal.sendKeys(codpostal);

 }
  public  void  diligenciarFormulario(String nom,String apell,String codpostal){
        noMbre(nom);
        aPellido(apell);
        codigoPostal(codpostal);

    }
public  void btnContinue(){
    btnContinue.click();
}
    public  void btnFind(){
     btnEnd.click();
    }
 public  void retornoComercio(){
     btnInicio.click();

 }


}
