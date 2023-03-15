import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();

        System.out.println(" TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        System.out.println("Digite uma opição 1 aumentar o volume ou 2 para diminuir");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                smartTv.aumentarVolume();
                System.out.println("Volume " + smartTv.volume);
                break;
            case 2:
                smartTv.diminuirVolume();
                System.out.println("Volume " + smartTv.volume);
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }

        sc.close();
    }
}
