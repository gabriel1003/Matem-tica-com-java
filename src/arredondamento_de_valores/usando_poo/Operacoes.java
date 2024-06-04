package arredondamento_de_valores.usando_poo;

public class Operacoes {
    private double valor1;
    private double valor2;

    public Operacoes(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getDividir() {
        return valor1 / valor2;
    }

    public double getMultiplicar() {
        return valor1 * valor2;
    }

    public double getSomar() {
        return valor1 + valor2;
    }

    public double getSubtrair() {
        return valor1 - valor2;
    }
}
