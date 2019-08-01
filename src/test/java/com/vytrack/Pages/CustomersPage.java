package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {

    public CustomersPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[contains(text(),'Customers')]")
    public WebElement Customers;

    @FindBy (xpath = "//span[.='Accounts']")
    public WebElement Accounts;

    @FindBy (xpath ="//span[.='Contacts']" )
    public WebElement Contacts;

    @FindBy(className = "oro-subtitle")
    public WebElement CustomersPageName;





}
