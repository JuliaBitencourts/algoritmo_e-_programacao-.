import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números inteiro:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        int produto = numero1 * numero2;

        System.out.println("O produto dos números é " + produto);
    }
}