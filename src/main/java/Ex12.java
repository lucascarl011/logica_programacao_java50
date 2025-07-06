import java.util.Scanner;

/*
* Faça um programa para ler número da conta do cliente, saldo, debito e crédito. Após calcular e escrever o saldo atual
* for maior ou igual a zero e escrever a mensagem saldo positivo ou saldo negativo.
* */

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o valor do saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Digite o valor do débito: ");
        double debito = sc.nextDouble();
        System.out.println("Digite o valor do crédito: ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);

        if (saldoAtual >= 0) {
            System.out.printf("Saldo Positivo!");
        } else {
            System.out.println("Saldo Negativo!");
        }

        sc.close();
    }
}
