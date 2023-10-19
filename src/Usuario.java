public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.adicionrNovaAba();
        navegadorInternet.atualizarPagina();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();

        System.out.println("Status após operações:");
        System.out.println("Ligar: " + aparelhoTelefonico.getLigarStatus());
        System.out.println("Atender: " + aparelhoTelefonico.getAtenderStatus());
        System.out.println("Adicionar Nova Aba: " + navegadorInternet.getAdicionarNovaAbaStatus());
        System.out.println("Atualizar Página: " + navegadorInternet.getAtualizarPaginaStatus());
        System.out.println("Tocar Música: " + reprodutorMusical.getTocarMusicaStatus());
        System.out.println("Pausar Música: " + reprodutorMusical.getPausarMusicaStatus());
    }
}
