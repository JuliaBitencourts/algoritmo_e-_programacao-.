import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento:");
        int anonascimento = entrada.nextInt();

        System.out.println("Digite o ano atual:");
        int anoatual = entrada.nextInt();

        int idade = anoatual - anonascimento;
        int idade2030 = 2030 - anonascimento;

        System.out.println("Sua idade é "
        + idade + "\nVocê terá " + idade2030 + " anos em 2030");

    }
}