package aula_5_33_Metodos_de_classe_estaticos;

public class ServicoDePrecificacao {
    double definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        return produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

    }

    void definirPrecoVenda2(Produto produto, double percentualMargemLucro) {
        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }

}
