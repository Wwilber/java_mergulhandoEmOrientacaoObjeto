package aula_5_32_Metodo_de_instancia_alterando_variavel_estatica;

public class Produto {

    // VARIÁVEL GLOBAL - itálico:
    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo de embalagem: R$ %.2f%n", Produto.custoEmbalagem);
    }
}
