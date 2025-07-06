import java.util.Scanner;

/*
* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
* Considere que a média é poderada e que o peso das notas é 2, 3 e 5.
* */

public class Ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double N1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        double N2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        double N3 = sc.nextDouble();

        double mediaFinal = N1 * 2 + N2 * 3 + N3 * 5 / 10;

        System.out.printf("Sua média final é: %.2f%n", mediaFinal);

        sc.close();
    }
}
