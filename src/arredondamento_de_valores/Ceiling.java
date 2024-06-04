package arredondamento_de_valores;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja converter: ");
        double valor = sc.nextDouble();

        int ceiling = (int) Math.ceil(valor);
        System.out.println("O valor convertido é: " +ceiling);
        sc.close();
    }
}
