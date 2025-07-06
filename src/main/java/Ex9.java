import java.util.Scanner;

/*
* Ler um valor e escrever se o mesmo é positivo ou negativo
* */

public class Ex9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("VALOR NEGATIVO!");
        } else {
            System.out.println("VALOR POSITIVO!");
        }

        sc.close();
    }
}
