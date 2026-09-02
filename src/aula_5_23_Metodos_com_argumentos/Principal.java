package aula_5_23_Metodos_com_argumentos;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
//        calculadoraImc.altura = 1.82;
//        calculadoraImc.peso = 120;
          double altura = 1.82;
          double peso = 175;


    //
        IndiceMassaCorporal imc = calculadoraImc.calcular(altura, peso);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
               "está com obesidade %n", imc.altura, imc.peso);
        } else {
            System.out.printf(" O IMC é: %.2f%n", imc.resultado);
        }


    }
}
