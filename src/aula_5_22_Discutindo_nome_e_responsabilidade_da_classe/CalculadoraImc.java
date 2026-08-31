package aula_5_22_Discutindo_nome_e_responsabilidade_da_classe;

public class CalculadoraImc {

    double altura;
    double peso;

    IndiceMassaCorporal calcular(){
        double imcCalculado = peso / (altura * altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;

        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
