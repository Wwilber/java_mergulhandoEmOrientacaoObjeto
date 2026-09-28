package aula_5_29_Metodos_que_alteram_o_estado_de_objeto_recebido_como_parametro;

public class Principal {
    public static void main(String[] args) {

        Produto NovoProduto = new Produto();
        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        NovoProduto.precoCusto = 100;
        double margem = 10;
        // double resultado = servicoDePrecificacao.definirPrecoVenda(produto, margem);
        servicoDePrecificacao.definirPrecoVenda2(NovoProduto, margem);

        // System.out.printf("Preço Venda: %.2f%n", resultado);
        System.out.printf("Preço de Custo: %.2f%n", NovoProduto.precoCusto);
        System.out.printf("Preço Venda: %.2f%n", NovoProduto.precoVenda);

    }
}
