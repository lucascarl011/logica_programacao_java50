import java.util.Scanner;

/*
* Escreva um algoritmo para ler o salario mensal atual de um funcionario e o percentual de reajuste.
* Calcular e escrever o valor do novo salario.
* */

public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu sálario atual: ");
        double salarioAtual = sc.nextDouble();
        System.out.println("Digite o percentual de reajuste: ");
        double percentualReajuste = sc.nextDouble();

        double aumento = percentualReajuste * salarioAtual / 100;
        double novoSalario = salarioAtual + aumento;

        System.out.println("Novo sálario com aumento de 15% R$: " + novoSalario);

        sc.close();
    }
}
