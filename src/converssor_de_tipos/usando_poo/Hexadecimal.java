package converssor_de_tipos.usando_poo;

public class Hexadecimal {
    private int resto;
    private int valor;

    public Hexadecimal(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("o valor não pode ser negativo");
        }

        this.valor = valor;
    }

    public String getHexadecimal() {
        StringBuilder hexadecimal = new StringBuilder();
        int decimal = this.valor;
        while (decimal > 0) {
            resto = decimal % 16;
            char digitoHexadecimal = (resto < 10) ? (char) (resto + '0') : (char) (resto - 10 + 'a');
            hexadecimal.insert(0, digitoHexadecimal);
            decimal /= 16;
        }
        return hexadecimal.toString();
    }
}
