import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;
import java.util.Random;

public class SeuBarriga {
        private ChromeDriver driver;
        private WebDriverWait wait;
        private Alert alert;
        private static String name = "";
        private static String email = "";
        private static String senha = "";
        private static String nomeconta = "";
        private Random random;

        @Before
        public void acessaUrl(){
            System.getProperty("webdriver.chrome.driver","chromedriver.exe");
            this.driver  = new ChromeDriver();
            wait = new WebDriverWait(driver, 90);
            this.driver.get("https://srbarriga.herokuapp.com/");
            this.driver.manage().window().maximize();


        }
        @Test
        public void cadastroSucesso(){
            this.driver.findElement(By.xpath("//a[@href='/cadastro']")).click();
            this.driver.findElement(By.xpath("//input[@name='nome']")).click();
            setName("Vinicius");
            this.driver.findElement(By.xpath("//input[@name='nome']")).sendKeys(getName());
            this.random = new Random();
            int number = random.nextInt() * 100;
            setEmail("pedro.lima"+number+"@gmail.com");
            this.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getEmail());
            setSenha("senhaqualquer");
            this.driver.findElement(By.xpath("//input[@name='senha']")).sendKeys("senhaqualquer");
            this.driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();
            String usuario_sucesso = this.driver.findElement(By.xpath("//div[@role='alert']")).getText();

            Assert.assertEquals("Usuário inserido com sucesso", usuario_sucesso);
        }

        @Test
        public void validarLogin(){
            this.driver.findElement(By.xpath("//input[@name='email']")).click();
            this.wait.until(ExpectedConditions.elementToBeClickable(this.driver.findElement(By.xpath("//input[@name='email']"))));
            this.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getEmail());
            this.driver.findElement(By.xpath("//input[@name='senha']")).click();
            this.driver.findElement(By.xpath("//input[@name='senha']")).sendKeys("senhaqualquer");
            this.driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            String login_confirma = this.driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
            Assert.assertEquals("Bem vindo, "+getName()+"!", login_confirma);


        }

        @Test
        public void criarContaBancaria() {
            validarLogin();
            this.driver.findElement(By.xpath("//a[@role='button']")).click();
            this.driver.findElement(By.xpath("//a[@href='/addConta']")).click();
            this.driver.findElement(By.xpath("//input[@id='nome']")).click();
            setNomeconta("James");
            this.driver.findElement(By.xpath("//input[@id='nome']")).sendKeys(getNomeconta());
            this.driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            String contaB_valida = this.driver.findElement(By.xpath("//div[@class = 'alert alert-success']")).getText();
            Assert.assertEquals("Conta adicionada com sucesso!", contaB_valida);

        }

        @Test
        public void criarMovimentacao() {
            validarLogin();
            this.driver.findElement(By.xpath("//a[@href='/movimentacao']")).click();
            this.driver.findElement(By.xpath("//input[@id='data_transacao']")).click();
            this.driver.findElement(By.xpath("//input[@id='data_transacao']")).sendKeys("20/02/2019");
            this.driver.findElement(By.xpath("//input[@id='data_pagamento']")).click();
            this.driver.findElement(By.xpath("//input[@id='data_pagamento']")).sendKeys("21/03/2020");
            this.driver.findElement(By.xpath("//input[@id='descricao']")).click();
            this.driver.findElement(By.xpath("//input[@id='descricao']")).sendKeys("texto de teste");
            this.driver.findElement(By.xpath("//input[@id='interessado']")).sendKeys("zézinho");
            this.driver.findElement(By.xpath("//input[@id='valor']")).click();
            this.driver.findElement(By.xpath("//input[@id='valor']")).sendKeys("2000");
            this.driver.findElement(By.xpath("//input[@id = 'status_pago']")).click();
            this.driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
            String valida_movimentacao = this.driver.findElement(By.xpath("//div[@role='alert']")).getText();

            Assert.assertEquals("Movimentação adicionada com sucesso!", valida_movimentacao);
        }

        @After
        public void fechaBrowser(){
            this.driver.quit();
        }

        public static String getName() {
            return name;
        }
        public static void setName(String name) {
            SeuBarriga.name = name;
        }
        public static String getEmail() {
            return email;
        }
        public static void setEmail(String email) {
            SeuBarriga.email = email;
        }
        public static String getSenha() {
            return senha;
        }
        public static void setSenha(String senha) {
            SeuBarriga.senha = senha;
        }
        public static String getNomeconta() {
            return nomeconta;
        }
        public static void setNomeconta(String nomeconta) {
            SeuBarriga.nomeconta = nomeconta;
        }

    }

