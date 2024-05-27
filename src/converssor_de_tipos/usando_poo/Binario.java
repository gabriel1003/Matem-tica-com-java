package converssor_de_tipos.usando_poo;

public class Binario {
    private int valor;

    public Binario(int valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor digitado não pode ser negativo.");
        }
        this.valor = valor;
    }

    public String getBinario() {
        if (this.valor == 0) {
            return "0";
        }
        StringBuilder decimalParaBinario = new StringBuilder();
        int valorBinario = valor;
        while (valorBinario >0) {
            int resto = valorBinario % 2;
            decimalParaBinario.insert(0, resto);
            valorBinario /= 2;
        }
        return decimalParaBinario.toString();
    }
}
