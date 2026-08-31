package aula_5_21_Refatorando_para_tornar_uma_classse_mais_rica;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 120;

        // CHAMA O metodo da classe  Paciente:
        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        // chama o metodo da classe IndiceMassaCorporal:
        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
               "está com obesidade %n", imc.altura, imc.peso);
        }
            System.out.printf(" O IMC é: %.2f%n", imc.resultado);


    }
}
