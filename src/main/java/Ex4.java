import java.util.Scanner;

/*
* Escreva um algoritmo para ler o número total de eleitores de um municipio, o número de votos brancos, nulos e válidos.
* Calcule e escreva o percentual que cada um representa em realção ao total de eleitores.
* */

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int eleitores, VB, VN, VV;

        System.out.println("digite o número de eleitores: ");
        eleitores = sc.nextInt();
        System.out.println("Digite o número de votos brancos: ");
        VB = sc.nextInt();
        System.out.println("Digite o numero de votos nulos: ");
        VN = sc.nextInt();
        System.out.println("Digite o número de votos válidos: ");
        VV = sc.nextInt();

        int percentualBrancos = (VB * 100) / eleitores;
        int percentualNulos = (VN * 100) / eleitores;
        int percentualValidos = (VV * 100) / eleitores;


        System.out.println("Total de eleitores: " + eleitores);
        System.out.println("Percentual de votos Brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos Nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos Válidos: " + percentualValidos + "%");

        sc.close();
    }
}
