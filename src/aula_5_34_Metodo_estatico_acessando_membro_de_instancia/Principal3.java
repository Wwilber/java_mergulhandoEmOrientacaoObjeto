package aula_5_34_Metodo_estatico_acessando_membro_de_instancia;

public class Principal3 {
    public static void main(String[] args) {

        Produto.custoEmbalagem = 10.00;

        Produto produto = new Produto();

        produto.alterarPrecoCusto(100.00);

        System.out.printf("Total de custos: %.2f%n",
                Produto.calcularCustosTotais(produto));


    }
}
