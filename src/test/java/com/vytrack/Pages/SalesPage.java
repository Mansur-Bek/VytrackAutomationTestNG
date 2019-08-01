package com.vytrack.Pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage {

    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Sales')]")
    public WebElement Sales;

    @FindBy(xpath = "//span[.='Opportunities']")
    public WebElement Opportunities;

    @FindBy(className = "oro-subtitle")
    public WebElement SalesPageName;




}
