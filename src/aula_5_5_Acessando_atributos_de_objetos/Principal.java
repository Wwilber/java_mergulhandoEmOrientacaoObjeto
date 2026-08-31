package aula_5_5_Acessando_atributos_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.anoDeFabricacao = 2022;
        seuCarro.cor = "branca";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo="X6";



        System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.println();
        System.out.println("Ano de Fabricacao: " + seuCarro.anoDeFabricacao);
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
    }
}
