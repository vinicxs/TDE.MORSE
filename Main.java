import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecodMorse decodificador = new DecodMorse();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Selecione a opcao que deseja executar:");
            System.out.println("1. Decodificar Morse para Texto");
            System.out.println("2. Codificar Texto para Morse");
            System.out.println("3. Sair");
            System.out.print("Opcao: ");

            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o codigo Morse que você quer que seja decodificado: ");
                    String codigoMorse = scanner.nextLine().trim();
                    String textoDecodificado = decodificador.DecodMorse(codigoMorse);
                    System.out.println("Texto Decodificado: " + textoDecodificado);
                    break;
                case "2":
                    System.out.print("Digite o texto que deve ser codificado em Morse: ");
                    String texto = scanner.nextLine().trim().toUpperCase();
                    String codigo = decodificador.codificarMorse(texto);
                    System.out.println("Codigo Morse: " + codigo);
                    break;
                case "3":
                    continuar = false;
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opcao invalida. Por favor, tente novamente.");
            }

            System.out.println();
        }

        scanner.close();
    }
}