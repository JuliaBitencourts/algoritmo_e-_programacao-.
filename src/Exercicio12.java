import java.util.Scanner;
    public class Exercicio12 {
        public static void main(String[] args){
            Scanner e = new Scanner(System.in);

            System.out.println("Digite um número");
            double numero = e.nextDouble();

            double aoquadrado = Math.pow(numero,2);
            double aocubo = Math.pow(numero,3);
            double raizquadrada = Math.sqrt(numero);
            double elevado10 = Math.pow (10,numero);

            System.out.println("O número elevado ao quadrado: "+ aoquadrado + "\nO número elevado ao cubo: "+ aocubo + "\nA raiz quadrada do número: "+ raizquadrada + "\nO número elevado a potência de 10: "+elevado10);
        }
}