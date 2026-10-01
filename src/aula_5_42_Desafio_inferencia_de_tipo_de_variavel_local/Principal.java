package aula_5_42_Desafio_inferencia_de_tipo_de_variavel_local;

public class Principal {
    public static void main(String[] args) {
        var raio = 22.00;
        var area = 25.00;
        double circulo = Area.calcularAreaCirculo(raio);
        double quadrdado = Area.calcularAreaQuadrado(area);

        System.out.printf("área do Circulo = %.2f%n ", circulo);
        System.out.printf("area do Quadrado = %.2f%n", quadrdado);

    }
}
