package aula_5_12_Inicializacao_de_objetos_em_variaveis_de_instancia;

public class TesteInicializacao {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.fabricante = "xxxxx";
        meuCarro.anoDeFabricacao = 2000;
        meuCarro.proprietario.nome = "maria";
        Pessoa proprietarioAntigo = meuCarro.proprietario;
        meuCarro.proprietario = new Pessoa();

        System.out.printf("fabricante: %s%n", meuCarro.fabricante);
        System.out.printf("modelo: %s%n", meuCarro.modelo);
        System.out.printf("ano de fabricacao: %d%n", meuCarro.anoDeFabricacao);
        System.out.printf("proprietario: %s%n", meuCarro.proprietario.nome);

    }
}
