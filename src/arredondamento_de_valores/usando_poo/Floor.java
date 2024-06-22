package arredondamento_de_valores.usando_poo;

//O método Floor arredonda um valor para o maior inteiro e é amplamente usado para criptografia.

public class Floor implements Arredondamento {

    //Vamos implementar o método arredondar da interface Arredondamento.
    public double arredondar(double valor) {
        return Math.floor(valor);
    }
}
