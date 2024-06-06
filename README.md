## Explorando os Fundamentos da Linguagem Java (Português-BR)
Estava querendo revisar tudo que estudei até o momento sobre Java, então por que não documentar e explicar um pouco sobre o mais básico dessa linguagem que MUITOS olham de cara feia? O `Basic-of-Java` é um exemplo simples e didático que abrange vários conceitos fundamentais da linguagem de programação Java. Espero que eu possa servir de ajuda para algum iniciante que ainda tem medo de começar :)

### Importação de Classes
```java
import java.util.Scanner;
import java.util.ArrayList;
```
Essas linhas importam as classes `Scanner` e `ArrayList` da biblioteca padrão do Java. A classe `Scanner` é usada para leitura de dados do usuário, e a `ArrayList` é utilizada para trabalhar com listas dinâmicas.

### Declaração da Classe Principal
```java
public class ExemploBasicoJava {
```
Aqui, definimos a classe principal chamada `ExemploBasicoJava`. Em Java, todo o código deve estar dentro de uma classe.

### Método Principal
```java
public static void main(String[] args) {
```
O método `main` é o ponto de entrada do programa. É onde a execução começa quando você executa o programa.

### Criando um Objeto Scanner
```java
Scanner scanner = new Scanner(System.in);
```
Este objeto `Scanner` será utilizado para ler a entrada do usuário a partir do console.

### Declaração de Variáveis Primitivas
```java
int numeroInteiro = 10;
double numeroDecimal = 5.5;
boolean verdadeiroOuFalso = true;
```
Aqui, declaramos variáveis primitivas: um inteiro (`int`), um número decimal (`double`) e um valor booleano (`boolean`).

### Impressão no Console
```java
System.out.println("Exemplo básico de Java");
```
Esta linha imprime uma mensagem no console.

### Estrutura de Controle If-Else
```java
if (numeroInteiro > 5) {
    System.out.println("O número é maior que 5");
} else {
    System.out.println("O número não é maior que 5");
}
```
Este bloco de código usa a estrutura de controle `if-else` para decidir qual mensagem imprimir com base no valor de `numeroInteiro`.

### Estrutura de Controle Switch-Case
```java
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
```
Este bloco de código usa a estrutura `switch-case` para imprimir o dia da semana correspondente ao valor de `diaDaSemana`.

### Laço de Repetição For
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i);
}
```
Este laço `for` repete a impressão da variável `i` de 0 a 4.

### Laço de Repetição While
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```
Este laço `while` imprime o valor de `contador` enquanto ele for menor que 5, incrementando-o a cada iteração.

### Trabalhando com Arrays
```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```
Este código demonstra como trabalhar com arrays. O laço `for-each` percorre cada elemento do array `numeros` e imprime seu valor.

### Trabalhando com Listas
```java
ArrayList<String> listaNomes = new ArrayList<>();
listaNomes.add("Alice");
listaNomes.add("Bob");
listaNomes.add("Charlie");

System.out.println("Nomes na lista:");
for (String nome : listaNomes) {
    System.out.println(nome);
}
```
Aqui, criamos uma lista (`ArrayList`) de nomes e adicionamos alguns elementos a ela. Em seguida, percorremos a lista e imprimimos cada nome.

### Leitura de Dados do Usuário
```java
System.out.print("Digite seu nome: ");
String nomeUsuario = scanner.nextLine();
System.out.println("Olá, " + nomeUsuario);
```
Este trecho lê uma entrada de texto do usuário e a armazena na variável `nomeUsuario`, depois imprime uma saudação personalizada.

### Fechando o Scanner
```java
scanner.close();
```
Fechamos o objeto `Scanner` para liberar os recursos associados a ele.

### Chamando um Método
```java
saudacaoPersonalizada(nomeUsuario);
```
Aqui, chamamos um método personalizado `saudacaoPersonalizada` que exibe uma mensagem de boas-vindas.

### Manipulação de Objetos
```java
Pessoa pessoa = new Pessoa("João", 25);
System.out.println("Nome: " + pessoa.getNome());
System.out.println("Idade: " + pessoa.getIdade());
```
Este código cria um objeto da classe `Pessoa` e utiliza métodos getters para acessar seus atributos.

### Tratamento de Exceções
```java
try {
    int resultado = dividir(10, 0);
    System.out.println("Resultado da divisão: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero!");
}
```
Aqui, tentamos dividir um número por zero, o que gera uma exceção. Usamos um bloco `try-catch` para capturar e tratar a exceção.

### Método para Exibir uma Saudação Personalizada
```java
public static void saudacaoPersonalizada(String nome) {
    System.out.println("Bem-vindo, " + nome + "!");
}
```
Este método recebe um nome como argumento e imprime uma mensagem de boas-vindas.

### Método para Dividir Dois Números com Tratamento de Exceção
```java
public static int dividir(int a, int b) throws ArithmeticException {
    return a / b;
}
```
Este método divide dois números e pode lançar uma exceção `ArithmeticException` se houver uma tentativa de divisão por zero.

### Classe Pessoa
```java
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```
A classe `Pessoa` define um modelo de objeto com atributos `nome` e `idade`, além de métodos construtores, getters e setters para manipular esses atributos.

Este exemplo cobre muitos dos fundamentos da programação em Java, incluindo variáveis primitivas, estruturas de controle, laços de repetição, arrays, listas, leitura de entrada do usuário, métodos, manipulação de objetos e tratamento de exceções. É um ótimo ponto de partida para quem está começando a aprender Java.
