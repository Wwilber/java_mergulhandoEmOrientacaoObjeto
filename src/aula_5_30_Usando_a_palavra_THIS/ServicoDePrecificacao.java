package aula_5_30_Usando_a_palavra_THIS;

public class ServicoDePrecificacao {
    double definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        return produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

    }

    void definirPrecoVenda2(Produto produto, double percentualMargemLucro) {
        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

    }

}
