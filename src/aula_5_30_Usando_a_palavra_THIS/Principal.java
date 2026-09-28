package aula_5_30_Usando_a_palavra_THIS;

public class Principal {
    public static void main(String[] args) {

        Produto novoProduto = new Produto();
        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        novoProduto.precoCusto = 100;
        double margem = 10;
        // double resultado = servicoDePrecificacao.definirPrecoVenda(produto, margem);
        servicoDePrecificacao.definirPrecoVenda2(novoProduto, margem);
        System.out.printf("Preço de Custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço Venda: %.2f%n", novoProduto.precoVenda);
        System.out.println();
        novoProduto.alterarPrecoCusto(150);
        servicoDePrecificacao.definirPrecoVenda2(novoProduto, margem);
        // System.out.printf("Preço Venda: %.2f%n", resultado);
        System.out.printf("Preço de Custo: %.2f%n", novoProduto.precoCusto);
        System.out.printf("Preço Venda: %.2f%n", novoProduto.precoVenda);

    }
}
