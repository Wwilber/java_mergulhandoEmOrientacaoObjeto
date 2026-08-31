package aula_5_18_Implementando_metodos_menores_e_evitando_duplicacao_de_codigo;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    double precoCompra;
    int anoDeFabricacao;
    // COMPOSIÇÃO DE OBJETO:
    Pessoa proprietario;


    void imprimirResumoDepreciacao() {

        double valorRevendaMeuCarro = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de Revenda): %6.2f%n", valorRevendaMeuCarro);
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoDeFabricacao;
    }

    double calcularIpva(){
        return calcularValorRevenda() * 0.04;
    }

    double calcularValorRevenda() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

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
