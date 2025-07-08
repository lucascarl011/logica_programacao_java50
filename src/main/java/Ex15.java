import java.util.Scanner;

/*
* Ler 3 valores e escrever eles em ordem crescente
* */

public class Ex15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int c = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);

        sc.close();
    }
}
