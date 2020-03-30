package br.com.appName.steps.web;

import br.com.application.name.web.funcionalidade.AcessarListaUsuariosWebFuncionalidade;
import br.com.application.name.web.funcionalidade.DelUserWebFuncionalidade;
import com.jayway.restassured.internal.assertion.Assertion;
import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;

public class ApagarUsuarioWebSteps {


    private AcessarListaUsuariosWebFuncionalidade acessarListaUsuariosWebFuncionalidade;
    private DelUserWebFuncionalidade delUserWebFuncionalidade;

    public ApagarUsuarioWebSteps(){
        this.acessarListaUsuariosWebFuncionalidade = new AcessarListaUsuariosWebFuncionalidade();
        this.delUserWebFuncionalidade = new DelUserWebFuncionalidade();
    }

    @E("^apago o usuário$")
    public void apagoOUsuário() throws InterruptedException {
        //Thread.sleep(1000);
        System.out.println("Apagando usuário...");
        this.delUserWebFuncionalidade.deletarUsuarios();
        Thread.sleep(2000);
    }

    @Entao("^visualizo na pagina \"([^\"]*)\"$")
    public void visualizoNaPagina(String arg0) throws Throwable {
        Thread.sleep(2000);
        Assert.assertEquals("Seu Usuário foi removido com sucesso!", this.acessarListaUsuariosWebFuncionalidade.retornaMensagem());
        throw new PendingException();
    }
}
