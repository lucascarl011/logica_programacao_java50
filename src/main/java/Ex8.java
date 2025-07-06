import java.util.Scanner;

/*
* Ler um valor e escrever "O VALOR É MAIOR QUE 10", caso o valor informado seja maior que 10, caso contrário informar "VALOR MENOR QUE 10".
* * */

public class Ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o um valor: ");
        int valor = sc.nextInt();

        if (valor == 10) {
            System.out.println("O VALOR É IGUAL A 10!");
        } else if (valor > 10){
            System.out.println("O VALOR É MAIOR QUE 10!");
        } else {
            System.out.println("O VALOR É MENOR QUE 10!");
        }

        sc.close();
    }
}
