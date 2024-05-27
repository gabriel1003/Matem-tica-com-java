package converssor_de_tipos.usando_poo;

public class OtaDecimal {

    private int valor;

    public OtaDecimal(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Digite um valor positivo");
        }
        this.valor = valor;
    }

    public String getValorOtaDecimal() {
        if (valor == 0) {
            return "0";
        }

        StringBuilder decimalParaOtaDecimal = new StringBuilder();
        int otaDecimal = valor;

        while (otaDecimal > 0) {
            int resto = otaDecimal % 8;

            decimalParaOtaDecimal.insert(0, resto);
            otaDecimal /= 8;
        }
        return decimalParaOtaDecimal.toString();
    }
}
