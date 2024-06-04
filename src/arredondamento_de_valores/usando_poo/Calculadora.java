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
            System.out.println("\tQual é a sua opção?");

            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\tDigite apenas números inteiros.");
                sc.nextLine();
                op = 0;
                continue;
            }

            switch (op) {
                case 1:
                    System.out.println("\tDigite (1) se quiser apenas converter um resultado ou (2) se quer realisar uma operação numérica.");
                    System.out.println("\tQual é a sua opção?");
                    try {
                        op = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\tEntrada inválida! Digite um número inteiro.");
                        sc.nextLine();
                        op = 0;
                        continue;
                    }

                    if (op == 1) {
                        System.out.println("\tDigite o valor desejado: ");
                        try {
                            double valor = sc.nextDouble();
                            Floor fl = new Floor(valor);
                            System.out.println(fl.toString());
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
                            switch (vontade) {
                                case 1:
                                    multiplicar(sc);
                                    break;
                                case 2:
                                    subtrair(sc);
                                    break;
                                case 3:
                                    dividir(sc);
                                    break;
                                case 4:
                                    somar(sc);
                                    break;
                                default:
                                    System.out.println("\tDigite um valor válido!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\tEntrada inválida! Digite um número inteiro.");
                            sc.nextLine();
                        }
                    } else {
                        System.out.println("\tDigite um valor válido! ");
                    }
                    break;
                case 2:
                    System.out.println("\tDigite (1) se quiser apenas converter um resultado ou (2) se quer realisar uma operação numérica.");
                    System.out.println("\tQual é a sua opção?");

                    try {
                        op = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\tEntrada inválida! Digite um número inteiro.");
                        sc.nextLine();
                        op = 0;
                        continue;
                    }

                    if (op == 1) {
                        System.out.println("\tDigite o valor desejado: ");

                        try {
                            double valor = sc.nextDouble();
                            Ceiling cl = new Ceiling(valor);
                            System.out.println(cl.toString());
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
                            switch (vontade) {
                                case 1:
                                    multiplicarTeto(sc);
                                    break;
                                case 2:
                                    subtrairTeto(sc);
                                    break;
                                case 3:
                                    dividirTeto(sc);
                                    break;
                                case 4:
                                    somarTeto(sc);
                                    break;
                                default:
                                    System.out.println("\tDigite um valor válido!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\tDigite um número. ");
                            sc.nextLine();
                        }
                    }
                    break;
                default:
                    System.out.println("\tDigite um valor válido! ");
            }
        } while (op != 0);

        sc.close();
    }

    public static void multiplicar(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor = sc.nextDouble();
        System.out.println("\tPor quanto deseja multiplicar? ");
        double valor2 = sc.nextDouble();
        Operacoes ops = new Operacoes(valor, valor2);
        Floor fl = new Floor(ops.getMultiplicar());
        System.out.println(fl);
    }

    public static void subtrair(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor1 = sc.nextDouble();
        System.out.print("\tPor quanto deseja subtrair? ");
        double valor2 = sc.nextDouble();
        Operacoes operacoes = new Operacoes(valor1, valor2);
        Floor fl = new Floor(operacoes.getSubtrair());
        System.out.println(fl);
    }

    public static void dividir(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor1 = sc.nextDouble();
        System.out.print("\tPor quanto deseja dividir? ");
        double valor2 = sc.nextDouble();
        Operacoes operacoes = new Operacoes(valor1, valor2);
        Floor fl = new Floor(operacoes.getDividir());
        System.out.println(fl);
    }

    public static void somar(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor1 = sc.nextDouble();
        System.out.print("\tPor quanto deseja somar? ");
        double valor2 = sc.nextDouble();
        Operacoes operacoes = new Operacoes(valor1, valor2);
        Floor fl = new Floor(operacoes.getSomar());
        System.out.println(fl);
    }

    public static void multiplicarTeto(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor = sc.nextDouble();
        System.out.println("\tPor quanto deseja multiplicar? ");
        double valor2 = sc.nextDouble();
        Operacoes ops = new Operacoes(valor, valor2);
        Ceiling cl = new Ceiling(ops.getMultiplicar());
        System.out.println(cl);
    }

    public static void subtrairTeto(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor1 = sc.nextDouble();
        System.out.print("\tPor quanto deseja subtrair? ");
        double valor2 = sc.nextDouble();
        Operacoes operacoes = new Operacoes(valor1, valor2);
        Ceiling cl = new Ceiling(operacoes.getSubtrair());
        System.out.println(cl);
    }

    public static void dividirTeto(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor1 = sc.nextDouble();
        System.out.print("\tPor quanto deseja dividir? ");
        double valor2 = sc.nextDouble();
        Operacoes operacoes = new Operacoes(valor1, valor2);
        Ceiling cl = new Ceiling(operacoes.getDividir());
        System.out.println(cl);
    }

    public static void somarTeto(Scanner sc) {
        System.out.println("\tDigite o valor desejado: ");
        double valor1 = sc.nextDouble();
        System.out.print("\tPor quanto deseja Somar? ");
        double valor2 = sc.nextDouble();
        Operacoes operacoes = new Operacoes(valor1, valor2);
        Ceiling cl = new Ceiling(operacoes.getSomar());
        System.out.println(cl);
    }
}
