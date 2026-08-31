package aula_5_19_Saindo_do_metodo_com_a_clausula_return;

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
        meuCarro.anoDeFabricacao = 2010;
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
        seuCarro.precoCompra = 0;
        seuCarro.proprietario = voce;

        System.out.printf("Valor de Revenda: %6.2f%n",
                meuCarro.calcularValorRevenda());

//        double valorRevenda = System.out.println(meuCarro.calcularValorRevenda());
//        System.out.println(seuCarro.calcularValorRevenda());

        meuCarro.imprimirResumoDepreciacao();

        seuCarro.calcularValorRevenda();

        double valorRevendaMeuCarro = meuCarro.calcularValorRevenda();
        int tempoDeUsoMeuCarro = meuCarro.calcularTempoDeUsoEmAnos();
        double calcularValorIpva = meuCarro.calcularIpva();
        System.out.printf("IPVA: %6.2f%n", calcularValorIpva);
        //        System.out.printf("Tempo de uso (anos): %d%n",tempoDeUsoMeuCarro);
        //        System.out.printf("Valor de Revenda): %6.2f%n", valorRevendaMeuCarro);
        //        System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
        //        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        //        System.out.println();
        //        System.out.printf("proprietario: %s%n", meuCarro.proprietario.nome);
        //        System.out.printf("proprietario: %s%n", seuCarro.proprietario.nome);
        //        System.out.println("Ano de Fabricacao: " + seuCarro.anoDeFabricacao);
        //        System.out.printf("Modelo: %s%n", seuCarro.modelo);

    }
}
