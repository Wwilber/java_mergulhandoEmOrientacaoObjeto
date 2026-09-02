package aula_5_24_Passando_objetos_como_argumentos_de_metodos;
//
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
