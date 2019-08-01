package com.vytrack.Pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    public WebElement errorMessage;

    public void openURL (){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void login(String user){
        username.sendKeys(ConfigurationReader.getProperty(user));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }


}
