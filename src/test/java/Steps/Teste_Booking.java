package Steps;

import GerarPrint.CriarPasta;
import GerarPrint.Generator;
import Pages.*;
import GerarPrint.Screenshot;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class Teste_Booking {
    private WebDriver navegador;
    private CriarPasta pasta = new CriarPasta();


    @Rule
    public TestName testName = new TestName();


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bruno Cominotti\\IdeaProjects\\testeBooking\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }



    @Dado("que estou no site https://www.booking.com")
    public void queEstouNoSiteHttpsWwwBookingCom() {
        navegador.get("https://www.booking.com");
        String winHandleBefore = navegador.getWindowHandle();

    }


    @Quando("Preencho os dados de viagem")
    public void preenchoOsDadosDeViagem() throws IOException {
        Home home = new Home(navegador);
        home.preencherDadosViagem();
        pasta.criarPasta("f1");
        String screenshotArquivo = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);


    }

    @Quando("seleciono o local da hospedagem e faco a reserva")
    public void selecionoOLocalDaHospedagemEFacoAReserva() throws InterruptedException, IOException {
        Hospedagens hospedagens = new Hospedagens(navegador);
        hospedagens.escolherHotel();
        Thread.sleep(1000);
        String screenshotArquivo = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);


    }

    @Quando("preencho os dados dos hospedes")
    public void preenchoOsDadosDosHospedes() throws IOException, InterruptedException {
        DadosHospede dadoshospede = new DadosHospede(navegador);
        dadoshospede.preencherDadosPessoais();
        Thread.sleep(2000);
        String screenshotArquivo = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);

        DadosHospede dadosHospede = new DadosHospede(navegador);
        dadosHospede.clicarProximo();
        Thread.sleep(2000);
        String screenshotArquivo2 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo2);


    }

    @E("preencho os dados de pagamento")
    public void preenchoOsDadosDePagamento() throws InterruptedException, IOException {
        Pagamento pagamento = new Pagamento(navegador);
        pagamento.preencherDadosPagamento();
        Thread.sleep(2000);
        String screenshotArquivo = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);

        Pagamento pagamento1 = new Pagamento(navegador);
        pagamento1.verifiqueDadosPagamento();
        Thread.sleep(2000);
        String screenshotArquivo2 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo2);





    }

    @Então("valido se os dados estao corretos")
    public void validoSeOsDadosEstaoCorretos() throws InterruptedException, IOException {
        TelaValidacao telavalidacao = new TelaValidacao(navegador);
        telavalidacao.verificarTeste();
        Thread.sleep(2000);
        String screenshotArquivo = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo);


    }

    //SEGUNDO FLUXO

    @Quando("clico em atracao e clico em paris")
    public void clicoEmAtracaoEClicoEmParis() throws InterruptedException, IOException {
        TelaDestinoAtracao teladestinoatracao = new TelaDestinoAtracao(navegador);
        teladestinoatracao.escolherDestinoAtracao();
        pasta.criarPasta("f2");
        Thread.sleep(1000);
        String screenshotArquivo2 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo2);

    }


    @Quando("seleciono uma atracao e seleciono a quantidade de ingressos")
    public void selecionoUmaAtracaoESelecionoAQuantidadeDeIngressos() throws InterruptedException, IOException {
        TelaAtracoes telaatracoes = new TelaAtracoes(navegador);
        telaatracoes.selecionarAtracaoeIngresso();
        Thread.sleep(1000);
        String screenshotArquivo2 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo2);




    }



    @E("preencho os dados pessoais")
    public void preenchoOsDadosPessoais() throws IOException, InterruptedException {
        TelaDadosIngresso teladadosingresso = new TelaDadosIngresso(navegador);
        teladadosingresso.preencherDadosIngresso();
        Thread.sleep(1000);
        String screenshotArquivo2 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo2);

    }

    @Então("preencho os dados de pagamento do ingresso e valido o botao Pagar agora")
    public void preenchoOsDadosDePagamentoDoIngresso() throws InterruptedException, IOException {
        TelaPagamentoIngresso telapagamentoingresso = new TelaPagamentoIngresso(navegador);
        telapagamentoingresso.pagamentoIngresso();
        Thread.sleep(2000);
        String screenshotArquivo2 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo2);

        TelaPagamentoIngresso telapagamentoingresso1 = new TelaPagamentoIngresso(navegador);
        telapagamentoingresso1.validacao();
        Thread.sleep(2000);
        String screenshotArquivo3 = pasta.getPasta() + "//" + Generator.dataHoraParaArquivo() + testName.getMethodName() + ".png";
        Screenshot.take(navegador, screenshotArquivo3);

    }



}
