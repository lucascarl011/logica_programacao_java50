import java.util.Scanner;

/*
* Escreva um algoritmo para ler as dimensões de um retângulo (Base e altura) e calcule sua area.
* */

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int base, altura;

        System.out.println("Digite o valor da base: ");
        base = sc.nextInt();
        System.out.println("Digite o valor da altura: ");
        altura = sc.nextInt();

        int area = base * altura;

        System.out.println("Area do retângulo: " + area);

        sc.close();
    }
}
