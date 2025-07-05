import java.util.Scanner;

public class Ex1 {

    /*
    * Escreva um algoritmo para ler um valor e ecrever na tela seu antecessor
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor, resultado;

        System.out.println("Digite um valor para descobrir seu antecessor: ");
        valor = sc.nextInt();

        resultado = valor - 1;

        System.out.println("Antecessor: " + resultado);

        sc.close();
    }
}
