import java.util.Scanner;

/*
* Ler dois valores e escrever qual é o maior valor
* */

public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int v1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int v2 = sc.nextInt();

        System.out.println("Primeiro valor digitado: " + v1 + "\nSegundo valor digitado: "+ v2 + "\n");


        if (v1 > v2) {
            System.out.println("PRIMEIRO VALOR É O MAIORr!");
        } else {
            System.out.println("SEGUNDO VALOR É O MAIOR!");
        }

        sc.close();
    }
}
