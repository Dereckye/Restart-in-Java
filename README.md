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



#
#

## Exploring the Fundamentals of the Java Language (English-EN)
I wanted to review everything I've studied so far about Java, so why not document and explain a bit about the basics of this language that MANY people look down upon? The `Basic-of-Java` is a simple and didactic example that covers various fundamental concepts of the Java programming language. I hope I can help some beginners who are still afraid to start :)

### Importing Classes
```java
import java.util.Scanner;
import java.util.ArrayList;
```
These lines import the `Scanner` and `ArrayList` classes from the standard Java library. The `Scanner` class is used for reading user input, and the `ArrayList` is used for working with dynamic lists.

### Declaring the Main Class
```java
public class ExemploBasicoJava {
```
Here, we define the main class called `ExemploBasicoJava`. In Java, all code must be within a class.

### Main Method
```java
public static void main(String[] args) {
```
The `main` method is the entry point of the program. This is where execution starts when you run the program.

### Creating a Scanner Object
```java
Scanner scanner = new Scanner(System.in);
```
This `Scanner` object will be used to read user input from the console.

### Declaring Primitive Variables
```java
int numeroInteiro = 10;
double numeroDecimal = 5.5;
boolean verdadeiroOuFalso = true;
```
Here, we declare primitive variables: an integer (`int`), a decimal number (`double`), and a boolean value (`boolean`).

### Printing to the Console
```java
System.out.println("Exemplo básico de Java");
```
This line prints a message to the console.

### If-Else Control Structure
```java
if (numeroInteiro > 5) {
    System.out.println("O número é maior que 5");
} else {
    System.out.println("O número não é maior que 5");
}
```
This block of code uses the `if-else` control structure to decide which message to print based on the value of `numeroInteiro`.

### Switch-Case Control Structure
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
This block of code uses the `switch-case` structure to print the day of the week corresponding to the value of `diaDaSemana`.

### For Loop
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i);
}
```
This `for` loop repeats the printing of the variable `i` from 0 to 4.

### While Loop
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```
This `while` loop prints the value of `contador` while it is less than 5, incrementing it with each iteration.

### Working with Arrays
```java
int[] numeros = {1, 2, 3, 4, 5};
for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```
This code demonstrates how to work with arrays. The `for-each` loop iterates over each element in the `numeros` array and prints its value.

### Working with Lists
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
Here, we create a list (`ArrayList`) of names and add some elements to it. Then, we iterate over the list and print each name.

### Reading User Input
```java
System.out.print("Digite seu nome: ");
String nomeUsuario = scanner.nextLine();
System.out.println("Olá, " + nomeUsuario);
```
This snippet reads a text input from the user, stores it in the variable `nomeUsuario`, and then prints a personalized greeting.

### Closing the Scanner
```java
scanner.close();
```
We close the `Scanner` object to free up the resources associated with it.

### Calling a Method
```java
saudacaoPersonalizada(nomeUsuario);
```
Here, we call a custom method `saudacaoPersonalizada` that displays a welcome message.

### Object Manipulation
```java
Pessoa pessoa = new Pessoa("João", 25);
System.out.println("Nome: " + pessoa.getNome());
System.out.println("Idade: " + pessoa.getIdade());
```
This code creates an object of the `Pessoa` class and uses getter methods to access its attributes.

### Exception Handling
```java
try {
    int resultado = dividir(10, 0);
    System.out.println("Resultado da divisão: " + resultado);
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero!");
}
```
Here, we try to divide a number by zero, which throws an exception. We use a `try-catch` block to catch and handle the exception.

### Method to Display a Personalized Greeting
```java
public static void saudacaoPersonalizada(String nome) {
    System.out.println("Bem-vindo, " + nome + "!");
}
```
This method takes a name as an argument and prints a welcome message.

### Method to Divide Two Numbers with Exception Handling
```java
public static int dividir(int a, int b) throws ArithmeticException {
    return a / b;
}
```
This method divides two numbers and can throw an `ArithmeticException` if there is an attempt to divide by zero.

### Person Class
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
The `Pessoa` class defines a model object with attributes `nome` and `idade`, along with constructor, getter, and setter methods to manipulate these attributes.

This example covers many of the fundamental concepts of Java programming, including primitive variables, control structures, loops, arrays, lists, user input, methods, object manipulation, and exception handling. It is a great starting point for anyone beginning to learn Java.


