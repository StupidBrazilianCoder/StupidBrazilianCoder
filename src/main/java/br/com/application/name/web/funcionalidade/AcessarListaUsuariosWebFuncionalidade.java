package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.AcessarListaUsuariosWebPage;
import br.com.application.name.web.pages.CadastroWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AcessarListaUsuariosWebFuncionalidade extends BaseTest {

    private AcessarListaUsuariosWebPage acessarListaUsuariosWebPage;

    public AcessarListaUsuariosWebFuncionalidade() {
        this.acessarListaUsuariosWebPage = new AcessarListaUsuariosWebPage(webDriver);
    }

    public void acessarListaUsuarios() {
            this.acessarListaUsuariosWebPage.getLinkFormularios().click();
            wait.until(ExpectedConditions.visibilityOf(this.acessarListaUsuariosWebPage.getLinkFormLista()));
            this.acessarListaUsuariosWebPage.getLinkFormLista().click();
    }

    public String retornaMensagem() {
            return this.acessarListaUsuariosWebPage.getMsgConfirma().getText();
    }
}
