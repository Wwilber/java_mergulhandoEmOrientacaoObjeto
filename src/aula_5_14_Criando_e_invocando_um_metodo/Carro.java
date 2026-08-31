package aula_5_14_Criando_e_invocando_um_metodo;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    // COMPOSIÇÃO DE OBJETO:
    Pessoa proprietario;

    void calcularValorRevenda(){
        System.out.printf("Calcular valor de revenda de %s %d%n", modelo, anoDeFabricacao);
    }



}
