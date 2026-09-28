package aula_5_32_Metodo_de_instancia_alterando_variavel_estatica;

public class ServicoDePrecificacao {
    double definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        return produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

    }

    void definirPrecoVenda2(Produto produto, double percentualMargemLucro) {
        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) + 1);
        precoVendaCalculado += Produto.custoEmbalagem;
        produto.precoVenda = precoVendaCalculado;

    }

}
