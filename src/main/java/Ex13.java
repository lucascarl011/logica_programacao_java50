import java.util.Scanner;

/*
* Faça um programa para ler a quantidade maxima, minima e atual de um estoque. calcule a quantidade média M = (QTD MAXI + QTD MIN)/2.
* Se a quantidade atual for maior ou igual a quantidade media escrever "NÂO EFETUAR COMPRA" se estiver abaixo escrever "EFETUAR COMPRA".
* */

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdMax, qtdMin, qtdAtual, qtdMedia;

        System.out.println("Digite a quantidade Maxima: ");
        qtdMax = sc.nextInt();
        System.out.println("Digite a quantidade Minima: ");
        qtdMin = sc.nextInt();
        System.out.println("Digite a quantidade Atual: ");
        qtdAtual = sc.nextInt();

        qtdMedia = (qtdMax + qtdMin) / 2;

        System.out.println("Quantidade média: " + qtdMedia);

        if(qtdAtual >= qtdMedia) {
            System.out.println("NÂO EFETUAR COMPRA!");
        } else {
            System.out.println("EFETUAR COMPRA");
        }
        sc.close();
    }
}
