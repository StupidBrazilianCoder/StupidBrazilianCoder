package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.CadastroWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CadastroWebFuncionalidade extends BaseTest {

    private CadastroWebPage cadastroWebPage;

    public CadastroWebFuncionalidade() {
        this.cadastroWebPage = new CadastroWebPage(webDriver);
    }

    public void preencheFormulario(){
        wait.until(ExpectedConditions.visibilityOf(this.cadastroWebPage.getInputNome()));
        this.cadastroWebPage.getInputNome().sendKeys("AAAAAAAAAAAAAAA");
        this.cadastroWebPage.getInputSobrenome().sendKeys("AAAAA");
        this.cadastroWebPage.getInputEmail().sendKeys("aaaaaa@aaaaa.com.br");
        this.cadastroWebPage.getBtnCriar().click();
    }
}
