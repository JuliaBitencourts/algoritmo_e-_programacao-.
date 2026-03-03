import java.util.Scanner;
    public class Exercicio5 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite suas três notas:");
            double nota1 = entrada.nextDouble();
            double nota2 = entrada.nextDouble();
            double nota3 = entrada.nextDouble();

            double mediaaritmetica = (nota1 + nota2 + nota3)/3;

            System.out.println("A sua média aritmética é " + mediaaritmetica);

        }
    }

