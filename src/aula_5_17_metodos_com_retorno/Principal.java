package aula_5_17_metodos_com_retorno;

public class Principal {
    public static void main(String[] args) {

//        Carro testeCarro = new Carro();
//        testeCarro.modelo="Eclipse";
//        testeCarro.anoDeFabricacao=2026;
//        testeCarro.calcularValorRevenda();
//        System.out.println("-------------");


        Pessoa eu = new Pessoa();
        eu.nome = "Thiago Faria";
        eu.cpf = "111.222.333-44";
        eu.anoNascimento = 1981;

        Pessoa voce = new Pessoa();
        voce.nome = "Maria João";
        voce.cpf = "234.567.889-11";
        voce.anoNascimento = 1970;

        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";
        meuCarro.precoCompra = 100000;
        meuCarro.proprietario = eu;


////        meuCarro.proprietario = new Pessoa();
////        meuCarro.proprietario.nome="Wilber Ribeiro";
////        meuCarro.proprietario.cpf="371.778.693-87";
////        meuCarro.proprietario.anoNascimento=1972;

        Carro seuCarro = new Carro();
        seuCarro.anoDeFabricacao = 2000;
        seuCarro.cor = "branca";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 100000;
        seuCarro.proprietario = voce;

        System.out.printf("Valor de Revenda: %6.2f%n",
                meuCarro.calcularValorRevenda() );

//        double valorRevenda = System.out.println(meuCarro.calcularValorRevenda());
//        System.out.println(seuCarro.calcularValorRevenda());

        seuCarro.calcularValorRevenda();
//
//        System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.println();
//        System.out.printf("proprietario: %s%n", meuCarro.proprietario.nome);
//        System.out.printf("proprietario: %s%n", seuCarro.proprietario.nome);
//        System.out.println("Ano de Fabricacao: " + seuCarro.anoDeFabricacao);
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);

    }
}
