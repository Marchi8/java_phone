package Phone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        // Implementação específica
        System.out.println("Música tocando.");
    }

    @Override
    public void pausar() {
        // Implementação específica
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação específica
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        // Implementação específica
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        // Implementação específica
        System.out.println("Telefone atendido.");
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação específica
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        // Implementação específica
        System.out.println("Exibindo site: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação específica
        System.out.println("Nova aba: " + url);
    }

    @Override
    public void atualizarPagina() {
        // Implementação específica
        System.out.println("Página atualizada");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Reprodutor musical
        System.out.println(" ");
        System.out.println("Reprodutor musical:");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Belchior - Coração Selvagem");

        // Aparelho telefonico
        System.out.println(" ");
        System.out.println("Aparelho telefônico:");
        iphone.ligar("984886962");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador de Internet
        System.out.println(" ");
        System.out.println("Navegador de Internet:");
        iphone.exibirPagina("youtube.com");
        iphone.adicionarNovaAba("gmail.com");
        iphone.atualizarPagina();
    }
}
