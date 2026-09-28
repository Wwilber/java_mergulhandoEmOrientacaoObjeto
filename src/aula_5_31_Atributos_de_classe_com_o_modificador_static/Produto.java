package aula_5_31_Atributos_de_classe_com_o_modificador_static;

public class Produto {

    // VARIÁVEL GLOBAL - itálico:
    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo de embalagem: R$ %.2f%n", Produto.custoEmbalagem);
    }
}
