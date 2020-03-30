package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelUserWebPage {

    public DelUserWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "/html/body/div[3]/div/table/tbody/tr[1]/td[11]/a")
    private WebElement btnLixo;

    public WebElement getBtnLixo() {
        return btnLixo;
    }
}
