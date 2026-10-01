package aula_5_40_Desafio_modificador_final_em_variavel_locais;

public class Principal {
    public static void main(String[] args) {
        double circulo = Area.calcularAreaCirculo(22.00);
        double quadrdado = Area.calcularAreaQuadrado(25.00);

        System.out.printf("área do Circulo = %.2f%n ", circulo);
        System.out.printf("area do Quadrado = %.2f%n", quadrdado);

    }
}
