package converssor_de_tipos.usando_poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeConversao {
    public static void main(String[] args) {
        //Usaremos um Scanner para pegar a opção do usuário.
        Scanner sc = new Scanner(System.in);

        int op;
        //Vamos usar um loop para exibir as opções para o usuário.
        do {
            System.out.println("\tBem-vindo ao seu conversor de valores numéricos. \n" +
                    "\tDigite (1) para converter de decimal para hexadecimal.\n" +
                    "\t(2) para converter de decimal para binário.\n" +
                    "\t(3) para converter para otadecimal.\n"+
                    "Ou digite (0) para sair." +
                    "Qual é a sua opção?");
            op = sc.nextInt();

            //O switch é responssável por receber as classes e o valor digitado pelo usuário.
            switch (op) {
                case 1:
                    //Usaremos um loop que vai esecutar enquanto o usuário digitar valores positivos.
                    while (true) {
                        //Usaremos um try catch para verificar se os valores do usuário são positivos.
                        try {
                            System.out.println("Digite o valor que você deseja converter: \n" +
                                    "Digite um valor negativo para voltar ao menuanterior .");
                            int valor = sc.nextInt();
                            //Usaremos um condicional para verificar se o valor for negativo encerra o loop.
                            if (valor < 0) {
                                break;
                            }
                            //Aqui temos o estanciamênto da classe aonde a lógica de converção foi desenvolvida.
                            Hexadecimal he = new Hexadecimal(valor);
                            System.out.println("O resultado é: " + he.getHexadecimal());
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Digite um número inteiro para converter.");
                            sc.next(); //Aqui limpa o buffer do Scanner
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break; //Os cases abaixo implementam a mesma regra.
                case 2:
                    while (true) {
                        try {
                            System.out.println("Digite o valor que deseja converter ou um número negativo para sair: ");
                            int valor = sc.nextInt();
                            if (valor <0) {
                                break;
                            }
                            Binario bi = new Binario(valor);
                            System.out.println("O resultado é: " +bi.getBinario());
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um número inteiro");
                            sc.next();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.println("Digite um valor inteiro para converter ou um número negativo para sair.");
                            int valor = sc.nextInt();
                            if (valor < 0) {
                                break;
                            }

                            OtaDecimal od = new OtaDecimal(valor);
                            System.out.println(od.getValorOtaDecimal());
                        } catch (InputMismatchException e) {
                            System.out.println("Digite um valor inteiro");
                            sc.next();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        } while (op != 0);
        sc.close();
    }
}
