package aula_5_31_Atributos_de_classe_com_o_modificador_static;

public class Principal2 {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        // MODIFICA O VALOR DA VARIÁVEL GLOBAL:
        //        produto1.custoEmbalagem = 15;
        //        produto2.custoEmbalagem = 20;

        // FORMA CORRETA DE ACESSAR VARIÁVEL GLOBAL:
        Produto.custoEmbalagem = 20.00;

        produto1.imprimirCustoEmbalagem();
        produto2.imprimirCustoEmbalagem();
    }
}