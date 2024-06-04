package arredondamento_de_valores;

//Aqui teremos um código java para arrendondar um inteiro usando o floor ou número piso. Eele é amplamente usado em algoritmos de ordenação e criptografia.

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja dividir.");
        double valor = sc.nextDouble();
        System.out.println("Por quanto você deseja dividi-lo? ");
        double dividir = sc.nextDouble();
        double resultadoDividido = valor / dividir;

        //Vamos usar a bibliotéca Math para arredondar o valor.
        int resposta = (int) Math.floor(resultadoDividido);
        System.out.printf("\nO resultado da divisão é: %.2f e o valor arredondado é: %d " ,resultadoDividido ,resposta);
sc.close();
    }
}
