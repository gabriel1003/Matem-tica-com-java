package arredondamento_de_valores.usando_poo;

public class Ceiling {
    private double valor;
    private int ceiling;

    public Ceiling(double valor) {
        this.valor = valor;
        this.ceiling = (int) Math.ceil(valor);
    }

    @Override
    public String toString() {
        return "\tO resultado da sua operação é: " + String.format("%.2f. ", valor) + "\tE arredondando usando o ceiling é: " + ceiling;
    }
}
