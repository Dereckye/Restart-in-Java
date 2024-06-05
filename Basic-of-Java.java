// Importa a classe Scanner para leitura de dados do usuário
// Import the Scanner class for user input reading
import java.util.Scanner;
// Importa a classe ArrayList para trabalhar com listas
// Import the ArrayList class to work with lists
import java.util.ArrayList;

public class ExemploBasicoJava {
    // Método principal, ponto de entrada do programa
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis primitivas
        // Declaration of primitive variables
        int numeroInteiro = 10;
        double numeroDecimal = 5.5;
        boolean verdadeiroOuFalso = true;

        // Impressão de texto no console
        // Printing text to the console
        System.out.println("Exemplo básico de Java");

        // Estrutura de controle: if-else
        // Control structure: if-else

        if (numeroInteiro > 5) {
            System.out.println("O número é maior que 5");
            // The number is greater than 5
        } else {
            System.out.println("O número não é maior que 5");
            // The number is not greater than 5
        }

        // Estrutura de controle: switch-case
        // Control structure: switch-case
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Segunda-feira");
                // Monday
                break;
            case 2:
                System.out.println("Terça-feira");
                // Tuesday
                break;
            case 3:
                System.out.println("Quarta-feira");
                // Wednesday
                break;
            default:
                System.out.println("Outro dia");
                // Another day
                break;
        }

        // Laço de repetição: for
        // Loop: for
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem: " + i);
            // Count: i
        }

        // Laço de repetição: while
        // Loop: while
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            // Counter: counter
            contador++;
        }

        // Trabalhando com arrays
        // Working with arrays
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Número: " + numero);
            // Number: number
        }

        // Trabalhando com listas
        // Working with lists
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Charlie");

        System.out.println("Nomes na lista:");
        // Names in the list:
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Leitura de dados do usuário
        // Reading user input
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Olá, " + nomeUsuario);
        // Hello, userName

        // Fechando o scanner
        // Closing the scanner
        scanner.close();

        // Chamando um método
        // Calling a method
        saudacaoPersonalizada(nomeUsuario);

        // Manipulação de objetos
        // Object manipulation
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Tratamento de exceções
        // Exception handling
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultado);
            // Division result: result
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
            // Error: Division by zero!
        }
    }

    // Método para exibir uma saudação personalizada
    // Method to display a personalized greeting
    public static void saudacaoPersonalizada(String nome) {
        System.out.println("Bem-vindo, " + nome + "!");
        // Welcome, name!
    }

    // Método para dividir dois números com tratamento de exceção
    // Method to divide two numbers with exception handling
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

// Classe Pessoa com atributos e métodos
// Person class with attributes and methods
class Pessoa {
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    // Constructor of the Person class
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    // Getter methods
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos setters
    // Setter methods
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
