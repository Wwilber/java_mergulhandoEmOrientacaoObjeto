package aula_5_31_Atributos_de_classe_com_o_modificador_static;

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
