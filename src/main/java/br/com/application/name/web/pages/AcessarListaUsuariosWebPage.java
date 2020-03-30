package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcessarListaUsuariosWebPage {

    public AcessarListaUsuariosWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[@class='collapsible-header ']")
    private WebElement linkFormularios;

    @FindBy(xpath = "//a[@href='/users']")
    private WebElement linkFormLista;

    @FindBy(xpath = "/html/body/div[3]/div/table/tbody/tr[10]/td[11]/a")
    private WebElement linkLixeira;

    @FindBy(id = "notice")
    private WebElement msgConfirma;

    public WebElement getMsgConfirma() {
        return msgConfirma;
    }

    public WebElement getLinkFormularios() {
        return linkFormularios;
    }

    public WebElement getLinkFormLista() {
        return linkFormLista;
    }

    public WebElement getLinkLixeira() {
        return linkLixeira;
    }
}
