package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.AcessarListaUsuariosWebFuncionalidade;
import br.com.application.name.web.funcionalidade.DelUserWebFuncionalidade;
import cucumber.api.java.es.Dado;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DelUserWebSteps {

    private AcessarListaUsuariosWebFuncionalidade acessarListaUsuariosWebFuncionalidade;
    private DelUserWebFuncionalidade delUserWebFuncionalidade;

    public DelUserWebSteps(){
        this.acessarListaUsuariosWebFuncionalidade = new AcessarListaUsuariosWebFuncionalidade();
        this.delUserWebFuncionalidade = new DelUserWebFuncionalidade();
    }


    @Dado("^que acesso a pagina com a lista de usuários$")
    public void acessoPaginaLista(){
            this.acessarListaUsuariosWebFuncionalidade.acessarListaUsuarios();
    }

}
