package aula_5_22_Discutindo_nome_e_responsabilidade_da_classe;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado <= 18.5;
    }

}
