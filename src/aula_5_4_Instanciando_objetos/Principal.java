package aula_5_4_Instanciando_objetos;

public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro seuCarro = new Carro();

        meuCarro.anoDeFabricacao = 2021;
        seuCarro.anoDeFabricacao = 2026;

        System.out.println("Ano de Fabricacao: " + meuCarro.anoDeFabricacao);
        System.out.println("Ano de Fabricacao: " + seuCarro.anoDeFabricacao);
    }
}
