import java.util.Scanner;

/*
* Ler 3 valores e informar o maior
* */

public class Ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;

        System.out.println("Digite o primeiro valor: ");
        v1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        v2 = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        v3 = sc.nextInt();

        if (v1 > v2) {
            System.out.println("O maior valor é o primeiro: " + v1);
        } else if (v3 < v2) {
            System.out.println("O maior valor é o segundo: " + v2);
        } else {
            System.out.println("O maior valor é o terceiro: " + v3);
        }
        sc.close();
    }
}
