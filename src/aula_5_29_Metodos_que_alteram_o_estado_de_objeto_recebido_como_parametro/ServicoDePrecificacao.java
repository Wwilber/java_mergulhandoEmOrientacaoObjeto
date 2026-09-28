package aula_5_29_Metodos_que_alteram_o_estado_de_objeto_recebido_como_parametro;

public class ServicoDePrecificacao {
    double definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        return produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

    }

    void definirPrecoVenda2(Produto produto, double percentualMargemLucro) {
        produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

    }

}
