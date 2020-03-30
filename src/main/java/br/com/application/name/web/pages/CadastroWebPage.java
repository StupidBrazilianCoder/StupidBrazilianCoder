package br.com.application.name.web.pages;

import br.com.application.name.configuration.Web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroWebPage {


    public CadastroWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "user_name")
    private WebElement inputNome;

    @FindBy(id = "user_lastname")
    private WebElement inputSobrenome;

    @FindBy(id = "user_email")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement btnCriar;

    @FindBy(xpath = "//input[@name='user[address]']")
    private WebElement inputEndereco;

    @FindBy(xpath = "//input[@name='user[university]']")
    private WebElement inputUniversidade;

    @FindBy(xpath = "//input[@name='user[profile]']")
    private WebElement inputProfissao;

    @FindBy(xpath = "//input[@name='user[gender]']")
    private WebElement inputGenero;

    @FindBy(xpath = "//input[@name='user[age]']")
    private WebElement inputIdade;

    public WebElement getInputEndereco() {
        return inputEndereco;
    }

    public WebElement getInputUniversidade() {
        return inputUniversidade;
    }

    public WebElement getInputProfissao() {
        return inputProfissao;
    }

    public WebElement getInputGenero() {
        return inputGenero;
    }

    public WebElement getInputIdade() {
        return inputIdade;
    }

    public WebElement getInputNome() {
        return inputNome;
    }

    public WebElement getInputSobrenome() {
        return inputSobrenome;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getBtnCriar() {
        return btnCriar;
    }
}
