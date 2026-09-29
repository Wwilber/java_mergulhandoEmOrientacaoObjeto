package aula_5_35_Desafio_membros_estaticos;

public class Principal {
    public static void main(String[] args) {
        double circulo = Area.calcularAreaCirculo(10.00);
        double quadrdado = Area.calcularAreaQuadrado(20.00);

        System.out.printf("área do Circulo = %.2f%n ", circulo);
        System.out.printf("area do Quadrado = %.2f%n", quadrdado);

    }
}
