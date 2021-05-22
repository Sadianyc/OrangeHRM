package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends Config {
    public Login_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.ID, using = "txtUsername")
    public WebElement userName;

    @FindBy(how = How.ID, using = "txtPassword")
    public WebElement password;

    @FindBy(how = How.ID, using = "btnLogin")
    public WebElement login_Button;

    public void enter_userName(String Input_userName){
        userName.sendKeys(Input_userName); }

    public void enter_password(String Input_password){
      password.sendKeys(Input_password); }

      public void click() {
        login_Button.click(); }

}
