package aula_5_37_Modificador_final_em_variaveis_locais;

public class Visitante {
    static final int IDADE_MINIMA_ACESSO_RESTRITO = 18;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade(){
        return idade < Visitante.IDADE_MINIMA_ACESSO_RESTRITO;
    }
}
