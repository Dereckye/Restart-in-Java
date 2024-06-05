// Importa a classe Scanner para leitura de dados do usuário
import java.util.Scanner;
// Importa a classe ArrayList para trabalhar com listas
import java.util.ArrayList;

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

        // Trabalhando com listas
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Charlie");

        System.out.println("Nomes na lista:");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Leitura de dados do usuário
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Olá, " + nomeUsuario);

        // Fechando o scanner
        scanner.close();

        // Chamando um método
        saudacaoPersonalizada(nomeUsuario);

        // Manipulação de objetos
        Pessoa pessoa = new Pessoa("João", 25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Tratamento de exceções
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero!");
        }
    }

    // Método para exibir uma saudação personalizada
    public static void saudacaoPersonalizada(String nome) {
        System.out.println("Bem-vindo, " + nome + "!");
    }

    // Método para dividir dois números com tratamento de exceção
    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

// Classe Pessoa com atributos e métodos
class Pessoa {
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
