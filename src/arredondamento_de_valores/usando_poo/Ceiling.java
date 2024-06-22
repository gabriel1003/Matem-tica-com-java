package arredondamento_de_valores.usando_poo;

//O método ceiling arredonda um valor para o maior inteiro aproximádo.

public class Ceiling implements Arredondamento{

    //Vamos implementar o método arredondar da interface Arredondamento.
    @Override
    public double arredondar(double valor) {
        return Math.ceil(valor);
    }

}