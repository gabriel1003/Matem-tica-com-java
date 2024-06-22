package arredondamento_de_valores.usando_poo;

public class Operacoes {

    public double calcular(double valor1, double valor2, Arredondamento arredondamento, String operacao) {
        switch (operacao) {
            case "multiplicar":
                return arredondamento.arredondar(valor1 * valor2);
            case "dividir":
                if (valor2 == 0) {
                    throw new ArithmeticException("Você está tentando dividir por 0");
                }
                return arredondamento.arredondar(valor1 / valor2);
            case "subtrair":
                return arredondamento.arredondar(valor1 - valor2);
            case "somar":
                return arredondamento.arredondar(valor1 + valor2);
            default:
                throw new IllegalArgumentException("Digite uma opção válida! ");
        }
    }

}