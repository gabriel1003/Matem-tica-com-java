package converssor_de_tipos.usando_poo;

public class Octal {

    private int valor;

    public Octal(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Digite um valor positivo");
        }
        this.valor = valor;
    }

    public String getValorOctal() {
        if (valor == 0) {
            return "0";
        }

        StringBuilder decimalParaOctal = new StringBuilder();
        int octal = valor;

        while (octal > 0) {
            int resto = octal % 8;

            decimalParaOctal.insert(0, resto);
            octal /= 8;
        }
        return decimalParaOctal.toString();
    }
}
