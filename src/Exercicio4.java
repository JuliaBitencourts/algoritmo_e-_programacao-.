import java.util.Scanner;
    public class Exercicio4 {
    public static void main(String[] args ){
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite quatro números inteiros:");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        int numero4 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4;

        System.out.println("O resultado da soma é "+ soma);
    }
}