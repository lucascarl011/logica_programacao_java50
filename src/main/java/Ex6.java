import java.util.Scanner;

/*
* Uma Rvendedora de carros usados paga a seus funcionários vendedores um sálario fixo por mês, mais uma comissão fixa
* por carro vendido e mais 5% sobre o total de vendas efetuadas.
* Escreva um algoritmo que leia o número de carros vendidos, o valor total de vendas, o valor que ele recebe por cada
* carro e o salário fixo e calcule o salário do mesmo.
* */

public class Ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Quantos carros foram vendidos: ");
        int qtdCarros = sc.nextInt();
        System.out.println("Digite a sua comissão por carro vendido: ");
        double comissaoPorCarro = sc.nextDouble();
        System.out.println("Digite o total de vendas: ");
        double totalVendas = sc.nextDouble();

        double salarioTotal = salarioFixo + (comissaoPorCarro * qtdCarros) + (totalVendas * 5) / 100;

        System.out.printf("Salário total a receber: R$ %.2f%n", salarioTotal );

        sc.close();
    }
}
