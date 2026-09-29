package aula_5_35_Desafio_membros_estaticos;

public class Area {
    static double pi = 3.14159265358979323846;

    static double  calcularAreaQuadrado(double area){
        double areaQuadrado = area * area;
        return areaQuadrado;
    }

    static double calcularAreaCirculo(double raio){
        double areaCirculo = (raio * raio) * Area.pi;
        return areaCirculo;
    }
}
