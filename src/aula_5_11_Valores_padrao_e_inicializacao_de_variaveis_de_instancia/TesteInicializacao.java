package aula_5_11_Valores_padrao_e_inicializacao_de_variaveis_de_instancia;

public class TesteInicializacao {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        System.out.printf("fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("modelo: %s%n", meuCarro.modelo);
        System.out.printf("ano de fabricacao: %d%n", meuCarro.anoDeFabricacao);

    }
}
