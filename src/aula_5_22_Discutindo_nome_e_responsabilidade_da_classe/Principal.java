package aula_5_22_Discutindo_nome_e_responsabilidade_da_classe;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.altura = 1.82;
        calculadoraImc.peso = 120;


        IndiceMassaCorporal imc = calculadoraImc.calcular();

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
               "está com obesidade %n", imc.altura, imc.peso);
        } else {
            System.out.printf(" O IMC é: %.2f%n", imc.resultado);
        }


    }
}
