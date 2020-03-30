package br.com.application.name.web.funcionalidade;

import br.com.application.name.commons.BaseTest;
import br.com.application.name.web.pages.DelUserWebPage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DelUserWebFuncionalidade extends BaseTest {

    private DelUserWebPage delUserWebPage;

    public DelUserWebFuncionalidade() {
        this.delUserWebPage = new DelUserWebPage(webDriver);
    }

    public void deletarUsuarios() throws InterruptedException {
        Thread.sleep(2000);
        this.delUserWebPage.getBtnLixo().click();
        alertText();
    }


}
