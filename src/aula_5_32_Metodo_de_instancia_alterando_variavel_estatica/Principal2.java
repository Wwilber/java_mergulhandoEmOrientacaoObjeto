package aula_5_32_Metodo_de_instancia_alterando_variavel_estatica;

public class Principal2 {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // NÃO É BOA PRÁTICA:
        produto1.alterarCustoEmbalagem(9.99);
        produto2.alterarCustoEmbalagem(47.77);

        // MODIFICA O VALOR DA VARIÁVEL GLOBAL:
        //        produto1.custoEmbalagem = 15;
        //        produto2.custoEmbalagem = 20;

        // FORMA CORRETA DE ACESSAR VARIÁVEL GLOBAL:
        Produto.custoEmbalagem = 20.00;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}