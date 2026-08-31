package aula_5_21_Refatorando_para_tornar_uma_classse_mais_rica;

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
