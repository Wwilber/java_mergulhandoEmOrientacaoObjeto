package aula_5_40_Desafio_modificador_final_em_variavel_locais;

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
