package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.loginPage;
import util.DriverFactory;

public class loginPageStepsDef {
    WebDriver driver = DriverFactory.getDriver();
    loginPage loginPage = new loginPage(driver);

    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {
        loginPage.homePage();
    }


    @When("click {string} card in the top rigt")
    public void clickCardInTheTopRigt(String giris) {
        loginPage.clickRight(giris);
    }

    @Then("should see Login Page")
    public void shouldSeeLoginPage() {
        loginPage.loginButton();

    }

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {
        loginPage.login();
    }

    @When("click {string} radio button")
    public void clickRadioButton(String radio) {
        loginPage.mail(radio);

    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String name) {
        loginPage.girisYap(name);

    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String radiobutton) {
        loginPage.seeRadioButton(radiobutton);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String text) {
        loginPage.seeTextonEmail(text);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String password) {
        loginPage.seeTextonPassword(password);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        loginPage.seePasswordIcon();
    }

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String remember) {
        loginPage.seeRemember(remember);
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String login) {
        loginPage.seeLogin(login);
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        loginPage.phoneText();
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String forgot) {
        loginPage.forgotPassword(forgot);
    }

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String empty) {
        loginPage.emptyEmail(empty);
        
    }

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String emptyMessage) {
        loginPage.emptyPassword(emptyMessage);
    }

    @When("type Email {string}")
    public void typeEmail(String mail) {
        loginPage.writeEmail(mail);
    }

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {
        loginPage.notSeeEmail();

    }

    @When("type Password {string}")
    public void typePassword(String typePsw) {
        loginPage.typePswrd(typePsw);
    }

    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        loginPage.notseePassword();
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String emailClick) {
        loginPage.typeEmail(emailClick);
    }

    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String message) {
        loginPage.falseMessage(message);
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String string1, String string2) {
        loginPage.typeEmailandPassword(string1);
    }

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String message) {
        loginPage.falseLoginMessage(message);
    }
}
