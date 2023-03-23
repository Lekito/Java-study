public class Mensagem {
    public static void oberterMensagem(int hora) {
        if (hora >= 5 && hora <= 12) {
            mensagemBomDia();
        } else if (hora > 12 && hora <= 17) {
            mensagemBoaTarde();
        } else {
            mensagemBoaNoite();
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }
}
