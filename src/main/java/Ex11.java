import java.util.Scanner;

/*
* Ler a nota 1 e 2 de um aluno, calcule a média e diga se ele foi aprovado, ou reprovado.
* Considere Aprovado acima de 7.0.
* */

public class Ex11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double n2 = sc.nextDouble();

        double media = (n1 + n2) / 2;

        if (media >= 7.0) {
            System.out.println("Sua média foi: " + media + " - Aluno Aprovado!");
        }else {
            System.out.println("Sua média foi: " + media + " - Aluno Reprovado!");
        }

        sc.close();
    }
}
