import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class iPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical musicPlayer = new ReprodutorMusical();
        musicPlayer.tocar();
        musicPlayer.pausar();
        musicPlayer.selecionarMusica("Teto - Minha vida é um filme");

        AparelhoTelefonico tel = new AparelhoTelefonico();
        tel.ligar("40028922");
        tel.atender();
        tel.iniciarCorreioVoz();

        NavegadorInternet nav = new NavegadorInternet();
        nav.exibirPagina("https://instagram.com");
        nav.adicionarNovaAba();
        nav.atualizarPagina();
    }
}
