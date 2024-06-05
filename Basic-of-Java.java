// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;

public class ExemploBasicoJava {
    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis primitivas
        int numeroInteiro = 10;
        double numeroDecimal = 5.5;
        boolean verdadeiroOuFalso = true;

        // Impressão de texto no console
        System.out.println("Exemplo básico de Java");

        // Estrutura de controle: if-else
        if (numeroInteiro > 5) {
            System.out.println("O número é maior que 5");
        } else {
            System.out.println("O número não é maior que 5");
        }

        // Estrutura de controle: switch-case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            default:
                System.out.println("Outro dia");
                break;
        }

        // Laço de repetição: for
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
        }

        // Laço de repetição: while
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Trabalhando com arrays
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        // Leitura de dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);

        // Fechando o scanner
        scanner.close();
    }
}
