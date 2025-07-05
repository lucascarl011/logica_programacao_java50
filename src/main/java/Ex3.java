import java.util.Scanner;

/*
* Escreva um algoritmo que leia idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa
* expressa em dias.
* considerar ano 365 dias e mes 30 dias.
* */

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anos, meses, dias;

        System.out.println("Digite sua idade em anos: ");
        anos = sc.nextInt();
        System.out.println("Digite sua idade em meses: ");
        meses = sc.nextInt();
        System.out.println("Digite sua idade em dias: ");
        dias = sc.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em total de dias: " + idadeEmDias);

        sc.close();
    }
}
