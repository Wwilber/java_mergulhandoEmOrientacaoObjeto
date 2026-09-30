package aula_5_39_Inferencia_de_tipo_de_variavel_local;

public class Visitante {
    static final int IDADE_MINIMA_ACESSO_RESTRITO = 18;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade(){
        return idade < Visitante.IDADE_MINIMA_ACESSO_RESTRITO;
    }
}
