package arredondamento_de_valores.usando_poo;

//O arredondamento usando o método round, arredonda para o maior inteiro aproximádo ou seja, se temos o valor 3.51 ele vai arredondar para 4 e se tivermos 3.49 ele arredonda para 3.

public class Round implements Arredondamento {

    //Vamos usar o método arredondar da interface Arredondamento.
    @Override
    public double arredondar(double valor) {
        return Math.round(valor);
    }
}
