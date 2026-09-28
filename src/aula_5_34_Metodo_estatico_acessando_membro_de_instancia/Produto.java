package aula_5_34_Metodo_estatico_acessando_membro_de_instancia;

public class Produto {

    // VARIÁVEL GLOBAL - itálico:
    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    static double calcularCustosTotais(Produto produto){
        return produto.precoCusto + Produto.custoEmbalagem;
    }

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
