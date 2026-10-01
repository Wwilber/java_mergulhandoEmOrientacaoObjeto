package aula_5_42_Desafio_inferencia_de_tipo_de_variavel_local;

public class Area {

    static final double pi = 3.14159265358979323846;

    static double  calcularAreaQuadrado(double area){
        double areaQuadrado = area * area;
        return areaQuadrado;
    }

    static double calcularAreaCirculo(final double raio){
        double areaCirculo = (raio * raio) * Area.pi;
        return areaCirculo;
    }
}
