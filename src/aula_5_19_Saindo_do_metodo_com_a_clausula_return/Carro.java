package aula_5_19_Saindo_do_metodo_com_a_clausula_return;

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

        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado." +
                    "Não foi possível imprimir resumo de depreciaçao");

            // RETURN NO VOID PARA NÃO TER QUE IMPLMEMENTAR O ELSE:
            return;
        }
//        } else {
            System.out.printf("Tempo de uso (anos): %d%n", tempoDeUsoMeuCarro);
            System.out.printf("Valor de Revenda): %6.2f%n", valorRevendaMeuCarro);
//        }
    }

    int calcularTempoDeUsoEmAnos() {
        return 2022 - anoDeFabricacao;
    }

    double calcularIpva() {
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        if (tempoDeUsoEmAnos >= 10) {
            return 0;
        }

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
