package arredondamento_de_valores.usando_poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\tBem-vindo a sua calculadora de arredondamento.");
            System.out.println("\tDigite (1) para arredondar para floor (Piso);");
            System.out.println("\t(2) para ceiling (teto);");
            System.out.println("\t(3) para round (Inteiro aproximádo);");
            System.out.println("\t(0) para sair do loop.");
            System.out.println("\tQual é a sua opção?");

            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\tDigite apenas números inteiros.");
                sc.nextLine();
                op = -1;
                continue;
            }

            //Se o usuario digitar 0 ele sai do loop.
            if (op == 0) {
                break;
            }

            //Inicialisando o objeto de arredondamento.
            Arredondamento arredondar = null;
            switch (op) {
                case 1:
                    arredondar = new Floor();
                    break;
                case 2:
                    arredondar = new Ceiling();
                    break;
                case 3:
                    arredondar = new Round();
                    break;
                default:
                    System.out.println("\tDigite um valor válido! ");
                    continue; //Para voltar ao início do loop.
            }

            System.out.println("\tDigite (1) se deseja converter apenas um número ou (2) se deseja realisar uma operação.");
            System.out.println("\tQual é a sua opção? ");
            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\tEntrada inválida, digite um número inteiro.");
                sc.nextLine();
                op = -1;
                continue;
            }


            if (op == 1) {
                System.out.println("\tDigite o valor desejado: ");
                try {
                    double valor = sc.nextDouble();
                    System.out.println("\tResultado arredondado: " + arredondar.arredondar(valor));
                } catch (InputMismatchException e) {
                    System.out.println("\tEntrada inválida! Digite um número.");
                    sc.nextLine();
                }
            } else if (op == 2) {
                System.out.println("\tDigite (1) se deseja multiplicar;\n" +
                        "\t(2) se deseja subtrair;\n" +
                        "\t(3) se deseja dividir;\n" +
                        "\t(4) se deseja somar.\n" +
                        "\tQual é a sua opção?");
                try {
                    int vontade = sc.nextInt();
                    if (vontade >= 1 && vontade <= 4) {
                        System.out.println("\tDigite o primeiro valor: ");
                        double valor1 = sc.nextDouble();
                        System.out.println("\tDigite o segundo valor: ");
                        double valor2 = sc.nextDouble();

                        Operacoes operacoes = new Operacoes();
                        String operacao = "";
                        switch (vontade) {
                            case 1:
                                operacao = "multiplicar";
                                break;
                            case 2:
                                operacao = "subtrair";
                                break;
                            case 3:
                                operacao = "dividir";
                                break;
                            case 4:
                                operacao = "somar";
                                break;
                        }
                        try {
                            double resultado = operacoes.calcular(valor1, valor2, arredondar, operacao);
                            System.out.println("\tResultado da operação arredondado: " + resultado);
                        } catch (ArithmeticException e) {
                            System.out.println("\tErro: " + e.getMessage());
                        } catch (IllegalArgumentException e) {
                            System.out.println("\tErro: " + e.getMessage());
                        }
                    } else {
                        System.out.println("\tDigite um valor válido!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\tEntrada inválida! Digite um número inteiro.");
                    sc.nextLine();
                }
            } else {
                System.out.println("\tDigite um valor válido!");
            }
        } while (op != 0);

        sc.close();
    }
}
