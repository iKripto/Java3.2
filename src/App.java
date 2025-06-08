import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        System.out.print("Digite um valor para objA: ");
        objA.valor = scanner.nextInt();

        System.out.print("Digite um valor para objB: ");
        objB.valor = scanner.nextInt();

        System.out.println("\nAntes da troca:");
        objA.imprimirValor("objA");
        objB.imprimirValor("objB");

        ValorContainer.trocarValores(objA, objB);

        System.out.println("\nDepois da troca:");
        objA.imprimirValor("objA");
        objB.imprimirValor("objB");

        scanner.close();
    }
}