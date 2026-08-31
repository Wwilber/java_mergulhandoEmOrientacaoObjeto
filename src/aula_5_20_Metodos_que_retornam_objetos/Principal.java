package aula_5_20_Metodos_que_retornam_objetos;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        double altura = 1.82;
        double peso = 120;


        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.resultado >= 30) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
               "está com obesidade %n", imc.altura, imc.peso);
        } else {
            System.out.printf(" O IMC é: %.2f%n", imc.resultado);
        }


    }
}
