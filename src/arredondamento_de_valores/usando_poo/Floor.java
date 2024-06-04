package arredondamento_de_valores.usando_poo;

public class Floor {
    private int floor;
    private double valor;

    public Floor(double valor) {
        this.valor = valor;
        this.floor = (int) Math.floor(valor);
    }

@Override
    public String toString() {
        return "\tO valor da sua operação é: " +floor;
    }
}
