package aula_5_28_Metodos_que_alteram_o_valor_de_parametro_do_tipo_primitivo;

public class Principal {
    public static void main(String[] args) {
        double precoCompraFornecedor = 140;

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.calcularPrecoVenda(precoCompraFornecedor);

        double venda2 = servicoDePrecificacao.calcularPrecoVenda2(precoCompraFornecedor);

        System.out.printf("Preço: %.2f%n", precoCompraFornecedor);
        System.out.printf("Preço: %.2f%n", venda2);


    }
}
