public class Iphone {

    String ligar = "";
    String atender = "";
    String iniciarCorreioVoz = "";

    String exibirPagina = "";
    String adicionrNovaAba = "";
    String atualizarPagina = "";

    String tocarMusica = "";
    String pausarMusica = "";
    String selecionarMusica = "";
}

class AparelhoTelefonico {
    private Iphone iphone = new Iphone();

    public void ligar() {
        iphone.ligar = "Realizando ligação";
    }

    public void atender() {
        iphone.atender = "Atendendo chamada";
    }

    public String getLigarStatus() {
        return iphone.ligar;
    }

    public String getAtenderStatus() {
        return iphone.atender;
    }
}

class NavegadorInternet {
    private Iphone iphone = new Iphone();

    public void adicionrNovaAba() {
        iphone.adicionrNovaAba = "Aba criada";
        System.out.println(iphone.adicionrNovaAba);
    }

    public void atualizarPagina() {
        iphone.atualizarPagina = "Refresh executado";
        System.out.println(iphone.atualizarPagina);
    }

    public String getAdicionarNovaAbaStatus() {
        return iphone.adicionrNovaAba;
    }

    public String getAtualizarPaginaStatus() {
        return iphone.atualizarPagina;
    }

    @Override
    public String toString() {
        return "NavegadorInternet []";
    }
}

class ReprodutorMusical {
    private Iphone iphone = new Iphone();

    public void tocarMusica() {
        iphone.tocarMusica = "Tocando música";
        System.out.println(iphone.tocarMusica);
    }

    public void pausarMusica() {
        iphone.pausarMusica = "Música pausada";
        System.out.println(iphone.pausarMusica);
    }

    public void selecionarMusica() {
        iphone.selecionarMusica = "Música selecionada";
        System.out.println(iphone.selecionarMusica);
    }

    public String getTocarMusicaStatus() {
        return iphone.tocarMusica;
    }

    public String getPausarMusicaStatus() {
        return iphone.pausarMusica;
    }

    public String getSelecionarMusicaStatus() {
        return iphone.selecionarMusica;
    }
}
