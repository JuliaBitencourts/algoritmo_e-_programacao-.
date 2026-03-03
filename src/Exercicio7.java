import static javax.print.attribute.standard.MediaSizeName.A;

public class Exercicio7 {
    public static void main(String[] args){

        boolean resultado = (120-30)==(Math.pow(3,30));
        System.out.println(resultado);

        boolean resultado2 = (20%4/4) == 1 || (9 != 9);
        System.out.println(resultado2);

        boolean resultado3 = (5%2) >3;
        System.out.println(resultado3);

        char a = 'a';
        char A = 'A';
        boolean resultado4 = (a == A);
        System.out.println(resultado4);


    }
}