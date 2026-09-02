package aula_5_23_Metodos_com_argumentos;

//
public class CalculadoraImc {


    IndiceMassaCorporal calcular(double altura, double peso) {
        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;

        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
