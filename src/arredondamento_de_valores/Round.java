package arredondamento_de_valores;

//Aqui vamos trabalhar usando o método round da classe math.

import java.util.Scanner;

public class Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tDigite o valor que deseja arredondar para o inteiro mais próximo: ");
        double valor = sc.nextDouble();

//Aqui vamos usar a classe Math para encontrar o inteiro mais próximo.
        int valorAproximado = (int) Math.round(valor);
        System.out.println("O inteiro mais próximo é: " +valorAproximado);
        sc.close();
    }
}
