package aula_5_38_Sobrecarga_de_metodos;

public class Visitante {
    static final int IDADE_MINIMA_ACESSO_RESTRITO = 18;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade(){
        return idade < Visitante.IDADE_MINIMA_ACESSO_RESTRITO;
    }
}
