package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    By girisyap = By.xpath("//span[contains(@class,'user-wrapper')]//span[1]");
    By login = By.cssSelector("button[type='submit']");
    By mailbutton = By.cssSelector(".login-form__radio-buttons--first-label");
    By girisYapYazisi = By.cssSelector(".login-form__title");
    By radioButton = By.cssSelector("label[class='login-form__radio-buttons--first-label'] span[class='login-form__radio-buttons--span']");
    By textEmail = By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By textPassword = By.xpath("//input[@placeholder='Şifreniz']");
    By passwordIcon = By.cssSelector(".login-form__show-password-icon--img");
    By remember = By.cssSelector(".checkbox-span");
    By textofPhone = By.cssSelector("label[class='login-form__radio-buttons--second-label'] span[class='login-form__radio-buttons--span']");
    By seeForgotPasswordButton = By.cssSelector(".login-form__forgot-password-link");
    By emptyEmailMessage = By.xpath("//div[contains(text(),'Lütfen e-posta adresinizi giriniz.')]");
    By emptyPasswordMessage = By.xpath("//div[@class='login-form__password']//div[@class='input-container']//div[1]");
    By errorMessage = By.xpath("//div[contains(text(),'Lütfen geçerli bir e-posta adresi giriniz.')]");
    By falseLoginMsg = By.cssSelector(".login-form__header-errors--p");
    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);


        }
    public void homePage(){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
    }
    public void clickRight(String name){
        elementHelper.click(girisyap);

    }
    public void loginButton(){
        elementHelper.checkElementVisible(login);
    }
    public void login(){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/giris");
    }
    public void mail(String mailbuton){
        elementHelper.click(mailbutton);

    }
    public void girisYap(String giris){
        elementHelper.checkElementVisible(girisYapYazisi);
    }
    public void seeRadioButton(String rad){
        elementHelper.checkElementVisible(radioButton);

    }
    public void seeTextonEmail(String textOn){
        elementHelper.checkElementVisible(textEmail);

    }
    public void seeTextonPassword(String Password){
        elementHelper.checkElementVisible(textPassword);
    }
    public void seePasswordIcon(){
        elementHelper.checkElementVisible(passwordIcon);
    }
    public void seeRemember(String see){
        elementHelper.checkElementVisible(remember);
    }
    public void seeLogin(String loginsee){
        elementHelper.checkElementVisible(login);
    }

    public void  phoneText(){
        elementHelper.checkElementVisible(textofPhone);

    }
    public void forgotPassword(String forget){
        elementHelper.checkElementVisible(seeForgotPasswordButton);

    }
    public void clickLogin(){
        elementHelper.click(login);
    }
    public void emptyEmail(String empty ){
        elementHelper.checkElementVisible(emptyEmailMessage);

    }
    public void emptyPassword(String emptyp){
        elementHelper.checkElementVisible(emptyPasswordMessage);
    }
    public void writeEmail(String write){
        elementHelper.findElement(textEmail).sendKeys("enes@mail.com");

    }
    public boolean notSeeEmail() {
        boolean result = false;
        try{
            elementHelper.checkElementVisible(emptyEmailMessage);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public void typePswrd(String typ){
        elementHelper.findElement(textPassword).sendKeys("1234567890");

    }
    public boolean notseePassword(){
        boolean result = false;
        try{
            elementHelper.checkElementVisible(emptyPasswordMessage);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;

    }
    public void typeEmail(String email){
        elementHelper.findElement(textEmail).sendKeys("enes@mail@mail.com");
    }
    public void falseMessage(String falsemsg){
        elementHelper.checkElementVisible(errorMessage);
    }
    public void typeEmailandPassword(String typeMail ){
        elementHelper.findElement(textEmail).sendKeys("enes@mail.com");
        elementHelper.findElement(textPassword).sendKeys("123");
        elementHelper.click(login);
    }
    public void falseLoginMessage(String msg){
        elementHelper.checkElementVisible(falseLoginMsg);


    }
}
