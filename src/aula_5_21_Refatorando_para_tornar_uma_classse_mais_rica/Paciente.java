package aula_5_21_Refatorando_para_tornar_uma_classse_mais_rica;

public class Paciente {

    double altura;
    double peso;

    IndiceMassaCorporal calcularIndiceMassaCorporal(){
        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;

        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
