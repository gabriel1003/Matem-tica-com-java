package converssor_de_tipos.sem_poo;

//Esta classe não usa conceitos de orientação a objetos.

import java.util.Scanner;

public class ConverssorDecimal_para_ExaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resto, num;
        System.out.println("Bem-vindo ao seu converssor de decimal para hexadecimal.\n"+
        "Digite o número desejado: ");
        num = scanner.nextInt();
        StringBuilder hexadecimal = new StringBuilder();
        while (num > 0) {
            resto = num % 16;
            char digitoHexadecimal = (resto < 10) ? (char) (resto + '0') : (char) (resto - 10 + 'A');
            hexadecimal.insert(0, digitoHexadecimal);
            num /= 16;
        }
        System.out.println("O resultado é: " +hexadecimal.toString());
        scanner.close();
    }
}
