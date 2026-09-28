package aula_5_33_Metodos_de_classe_estaticos;

public class Produto {

    // VARIÁVEL GLOBAL - itálico:
    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo de embalagem: R$ %.2f%n", Produto.custoEmbalagem);
    }
}
