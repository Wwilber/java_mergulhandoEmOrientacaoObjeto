package aula_5_17_metodos_com_retorno;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoDeFabricacao;
    // COMPOSIÇÃO DE OBJETO:
    Pessoa proprietario;

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = 2022 - anoDeFabricacao;

        int vidaUtilEmAnos = 20;
        double valorRevenda = (precoCompra / vidaUtilEmAnos)
                * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
           // return 0;
        }
//        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoEmAnos);
//        System.out.printf("Valor de Revenda): %6.2f%n", valorRevenda);

        return valorRevenda;
    }


}
