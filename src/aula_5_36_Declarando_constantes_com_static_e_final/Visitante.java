package aula_5_36_Declarando_constantes_com_static_e_final;

public class Visitante {
    static final int IDADE_MINIMA_ACESSO_RESTRITO = 18;

    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade(){
        return idade < Visitante.IDADE_MINIMA_ACESSO_RESTRITO;
    }
}
